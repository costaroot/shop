package com.costaroot.product;

public abstract class Product implements Buyable {
    private String name;
    private int quantity;
    private double price;
    private AgeRestriction ageRestriction;

    public Product (String name,int quantity, double price, AgeRestriction ageRestriction){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.ageRestriction = ageRestriction;
    }

    public void pr(){
        System.out.println("Age res= "+this.ageRestriction);
    }

    public double getPrice(){
        return this.price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }
}
