package com.patterns.Creational.Factory.FactoryDesign;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType) {

        Pizza pizza=null;

        if(pizzaType=="Cheese"){
            pizza=new NYCheesePizza();
        }else if(pizzaType=="Veggie"){
            pizza=new NYVeggiePizza();
        }

        return pizza;
    }
}
