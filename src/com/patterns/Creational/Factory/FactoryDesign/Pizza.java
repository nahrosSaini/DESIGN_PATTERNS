package com.patterns.Creational.Factory.FactoryDesign;

import java.util.ArrayList;

public abstract class Pizza {

    protected String pizzaName;
    protected String pizzaSauce;
    protected String pizzaDough;
    protected ArrayList<String> toppings=new ArrayList<>();

    protected abstract void prepare();
    protected abstract void bake();
    protected abstract void cut();
    protected void box(){
     System.out.println("Putting Pizza under box..!!");
     System.out.println("--------Done..!!-----------\n");
    }

}
