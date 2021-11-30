package com.costaroot.product;

import java.util.Date;

public class FoodProduct extends Product implements Expirable{

    public FoodProduct (String name,int quantity, double price, AgeRestriction ageRestriction){
        super(name, quantity, price, ageRestriction);
    }
    @Override
    public Date getExpirationDate() {
        return null;
    }

    public void prin(){
        System.out.println(" Food prod name: "+this.getName());
    }

}
