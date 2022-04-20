package com.patterns.Creational.Factory.SimpleFactory;

public class VeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("VeggiePizza is Preparing..!!");
    }

    @Override
    public void bake() {
        System.out.println("VeggiePizza is Baking..!!");
    }

    @Override
    public void cut() {
        System.out.println("VeggiePizza is cutting in pieces..!!");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizza is ready to put in box..!!");
    }
}
