package com.patterns.Creational.Factory.SimpleFactory;

public class CalmPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("CalmPizza is Preparing..!!");
    }

    @Override
    public void bake() {
        System.out.println("CalmPizza is Baking..!!");
    }

    @Override
    public void cut() {
        System.out.println("CalmPizza is cutting into pieces..!!");
    }

    @Override
    public void box() {
        System.out.println("CalmPizza is ready to put in box..!!");
    }
}
