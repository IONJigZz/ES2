package com.es2.objectpool;

public class ObjectNotFoundException extends Exception{

    public ObjectNotFoundException(){
        System.out.println("Connection not found.");
    }
}
