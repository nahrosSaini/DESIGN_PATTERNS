package com.patterns.Creational.Factory.FactoryDesign.Client;

import com.patterns.Creational.Factory.FactoryDesign.NYPizzaStore;
import com.patterns.Creational.Factory.FactoryDesign.PizzaStore;

public class Client {
    public static void main(String[] args){

        PizzaStore nyPizzaStore=new NYPizzaStore();

        nyPizzaStore.orderPizza("Veggie");

    }
}
