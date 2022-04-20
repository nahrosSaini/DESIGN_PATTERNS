package com.patterns.Creational.Factory.FactoryDesign;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza=null;

        if(pizzaType=="Cheese"){
            pizza=new ChCheesePizza();
        }else if(pizzaType=="Veggie"){
            pizza=new ChVeggiePizza();
        }

        return pizza;
    }
}
