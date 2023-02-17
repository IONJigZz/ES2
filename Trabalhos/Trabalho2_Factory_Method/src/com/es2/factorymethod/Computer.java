package com.es2.factorymethod;

public class Computer extends Object implements Product{
    private String brandName = null;
    protected Computer(){

    }
    public void setBrand(String _brandName){brandName = _brandName;}
    public String getBrand(){return brandName;}
}
