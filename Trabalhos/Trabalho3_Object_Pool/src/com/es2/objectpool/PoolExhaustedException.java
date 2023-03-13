package com.es2.objectpool;

public class PoolExhaustedException extends Exception{

    public PoolExhaustedException(){
        System.out.println("Max connections reached. Please try again later.");
    }
}
