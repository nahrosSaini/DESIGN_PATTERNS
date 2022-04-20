package com.patterns.Creational.Factory.SimpleFactory;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("CheesePizza is Preparing..!!");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza is Baking..!!");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza is cutting into pieces..!!");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza is ready to put in box..!!");
    }
}
