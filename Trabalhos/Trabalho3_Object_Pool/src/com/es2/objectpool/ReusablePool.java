package com.es2.objectpool;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class ReusablePool extends Object{

    private static int maxPoolSize;
    private static int currPoolSize = 0;
    private String connURL = "http://localhost";
    private ArrayList<HttpURLConnection> isAvailable = new ArrayList<>();
    private ArrayList<HttpURLConnection> isOccupied = new ArrayList<>();

    public synchronized HttpURLConnection acquire() throws IOException, PoolExhaustedException {
        if (isAvailable.size() < maxPoolSize) {
            currPoolSize++;
            HttpURLConnection c = (HttpURLConnection) new java.net.URL(connURL).openConnection();
            isOccupied.add(c);
            isAvailable.add(c);
            return c;
        } else {
            throw new PoolExhaustedException();
        }
    }
    private ReusablePool(){

    }
    public synchronized static ReusablePool getInstance() {
        if (instance == null) {
            maxPoolSize = 10;
            instance = new ReusablePool();
        }
        return instance;
    }
    protected static ReusablePool instance;

    public synchronized void release(HttpURLConnection conn) throws ObjectNotFoundException {
        if (isOccupied.contains(conn)) {
            isOccupied.remove(conn);
            isAvailable.add(conn);
            currPoolSize--;
            System.out.println("Released connection: " + conn);
        } else {
            throw new ObjectNotFoundException();
        }
    }

    public synchronized void resetPool() {
        isOccupied.clear();
        System.out.println("Pool reset.");
    }

    public synchronized void setMaxPoolSize(int size) {
        maxPoolSize = size;
    }
}
