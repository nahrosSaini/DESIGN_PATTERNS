package com.patterns.Creational.AbstractFactory.Store;

import com.patterns.Creational.AbstractFactory.Ingredients.Cheese.Cheese;
import com.patterns.Creational.AbstractFactory.Ingredients.NYIngredients;
import com.patterns.Creational.AbstractFactory.Ingredients.PizzaIngredientFactory;
import com.patterns.Creational.AbstractFactory.Pizza.Pizza;
import com.patterns.Creational.AbstractFactory.Pizza.CheesePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType) {

        PizzaIngredientFactory nyIngredients=new NYIngredients();

        Pizza pizza=null;

        if(pizzaType=="Cheese"){
            pizza=new CheesePizza(nyIngredients);
        }

        return pizza;
    }
}
