package com.patterns.Creational.Factory.SimpleFactory;

public class SimplePizzaFactory {

    Pizza pizza=null;

    public Pizza createPizza(String pizzaType){

        if(pizzaType=="Cheese"){
            pizza=new CheesePizza();
        }else if(pizzaType=="Veggie"){
            pizza=new VeggiePizza();
        }else if(pizzaType=="Calm"){
            pizza=new CalmPizza();
        }

        return pizza;

    }
}
