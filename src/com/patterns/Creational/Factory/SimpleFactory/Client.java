package com.patterns.Creational.Factory.SimpleFactory;

public class Client {

    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();

        PizzaStore pizzaStore=new PizzaStore(simplePizzaFactory);

        pizzaStore.orderPizza("Veggie");
        pizzaStore.orderPizza("Calm");
        pizzaStore.orderPizza("Cheese");

    }



}
