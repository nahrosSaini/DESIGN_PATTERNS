package com.patterns.Creational.AbstractFactory.Store;

import com.patterns.Creational.AbstractFactory.Ingredients.ChicagoIngredients;
import com.patterns.Creational.AbstractFactory.Ingredients.NYIngredients;
import com.patterns.Creational.AbstractFactory.Ingredients.PizzaIngredientFactory;
import com.patterns.Creational.AbstractFactory.Pizza.CheesePizza;
import com.patterns.Creational.AbstractFactory.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType) {

        PizzaIngredientFactory chIngredients=new ChicagoIngredients();

        Pizza pizza=null;

        if(pizzaType=="Cheese"){
            pizza=new CheesePizza(chIngredients);
        }

        return pizza;
    }
}
