package com.patterns.Creational.AbstractFactory.Pizza;

import com.patterns.Creational.AbstractFactory.Ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;


    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
        toppings.add("corns");
        toppings.add("pepper");
    }

    @Override
    public void prepare() {
        pizzaName=pizzaIngredientFactory.createDough().toString();
        System.out.println("preparing you "+pizzaName );
        System.out.println("Adding "+pizzaDough +" Dough");
        System.out.println("Adding "+pizzaSauce);
        System.out.print("Adding topping : ");
        for (int i=0;i< toppings.size();i++){
            System.out.print(" "+toppings.get(i));
        }
        System.out.println();
    }

}
