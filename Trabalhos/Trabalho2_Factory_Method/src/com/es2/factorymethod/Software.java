package com.es2.factorymethod;

public class Software extends Object implements Product {
    private String brandName = null;
    protected Software(){

    }
    public void setBrand(String _brandName){
        brandName = _brandName;
    }
    public String getBrand(){
        return brandName;
    }
}
