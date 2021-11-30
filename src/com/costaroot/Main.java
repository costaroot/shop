package com.costaroot;

import com.costaroot.product.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This shop App");
        FoodProduct food = new FoodProduct("Apple",10,2.5,AgeRestriction.ADULT);
        food.pr();
        food.prin();
        System.out.println(" price"+food.getPrice()+ " UAH");
    }
}
