package com.patterns.Creational.Factory.SimpleFactory;

public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    PizzaStore(SimplePizzaFactory simplePizzaFactory1){
        this.simplePizzaFactory=simplePizzaFactory1;
    }


    public Pizza orderPizza(String pizzaType){
        Pizza pizza=null;

        pizza=simplePizzaFactory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

}
