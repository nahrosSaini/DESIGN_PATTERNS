package com.patterns.Creational.Factory.FactoryDesign;

public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaType){
        Pizza pizza=null;

        pizza=createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaType);
}
