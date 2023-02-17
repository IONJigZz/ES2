package com.es2.singleton;
public class Registry extends Object{

    private static Registry instance = null;
    private String path = null;
    private String connectionString = null;
    private Registry(){

    }

    public static Registry getInstance(){
        if(instance == null)
            instance = new Registry();
        return instance;
    }

    public String getPath(){
        return path;
    }
    public void setPath(String _path){
        path = _path;
    }
    public void setConnectionString(String _connectionString){
        connectionString = _connectionString;
    }
    public String getConnectionString(){
        return connectionString;
    }
}
