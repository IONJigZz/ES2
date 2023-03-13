package com.es2.memento;

import java.util.concurrent.ConcurrentHashMap;

public class BackupService extends Object{

    private Server server;
    private ConcurrentHashMap<Integer, Memento> snapshot = new ConcurrentHashMap<>();
    private int counter = 0;
    public BackupService(Server server){
        this.server = server;
    }

    public void takeSnapshot(){
        snapshot.put(counter, new Memento(server.getStudentNames()));
        counter++;
    }
    public void restoreSnapshot(int snapshotNumber) throws NotExistingSnapshotException{
        if(snapshot.containsKey(snapshotNumber))
            server.restore(snapshot.get(snapshotNumber));
        else
            throw new NotExistingSnapshotException();
    }

}
