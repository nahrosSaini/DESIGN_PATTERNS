package com.patterns.Creational.AbstractFactory.Ingredients;

import com.patterns.Creational.AbstractFactory.Ingredients.Calm.Calm;
import com.patterns.Creational.AbstractFactory.Ingredients.Calm.FrozenCalm;
import com.patterns.Creational.AbstractFactory.Ingredients.Cheese.Cheese;
import com.patterns.Creational.AbstractFactory.Ingredients.Cheese.MozzarellaCheese;
import com.patterns.Creational.AbstractFactory.Ingredients.Dough.Dough;
import com.patterns.Creational.AbstractFactory.Ingredients.Dough.ThickCrustDough;
import com.patterns.Creational.AbstractFactory.Ingredients.Pepperoni.Pepperoni;
import com.patterns.Creational.AbstractFactory.Ingredients.Pepperoni.PorkPepperoni;
import com.patterns.Creational.AbstractFactory.Ingredients.Sauce.PlumTomatoSauce;
import com.patterns.Creational.AbstractFactory.Ingredients.Sauce.Sauce;
import com.patterns.Creational.AbstractFactory.Ingredients.Veggie.Corn;
import com.patterns.Creational.AbstractFactory.Ingredients.Veggie.Tomato;
import com.patterns.Creational.AbstractFactory.Ingredients.Veggie.Veggie;

public class ChicagoIngredients implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Calm createCalm() {
        return new FrozenCalm();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PorkPepperoni();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggie[]={new Tomato(),new Corn()};
        return veggie;
    }
}
