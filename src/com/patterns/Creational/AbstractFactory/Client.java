package com.patterns.Creational.AbstractFactory;

import com.patterns.Creational.AbstractFactory.Store.ChicagoPizzaStore;
import com.patterns.Creational.AbstractFactory.Store.NYPizzaStore;
import com.patterns.Creational.AbstractFactory.Store.PizzaStore;

public class Client {
    public static void main(String[] args){
        PizzaStore pizzaStore=new ChicagoPizzaStore();

        pizzaStore.orderPizza("Cheese");

    }
}
