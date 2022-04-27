package com.patterns.Creational.AbstractFactory.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    protected String pizzaName;
    protected String pizzaSauce;
    protected String pizzaDough;
    protected ArrayList<String> toppings=new ArrayList<>();

    public abstract void prepare();

    public void bake(){
        System.out.println("Baking you Pizza at 200~ C");
    };
    public void cut(){
        System.out.println("Cutting your Pizza at into 4 pieces");
    };
    public void box(){
        System.out.println("Putting Pizza under box..!!");
        System.out.println("--------Done..!!-----------\n");
    }
}
