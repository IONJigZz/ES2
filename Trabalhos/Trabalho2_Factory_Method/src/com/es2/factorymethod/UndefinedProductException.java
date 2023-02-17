package com.es2.factorymethod;

public class UndefinedProductException extends Exception{

    public UndefinedProductException(){
        System.out.println("Invalid Product. Please select 'Computer' or 'Software'!");
    }
}
