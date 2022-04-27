package com.patterns.Creational.AbstractFactory.Ingredients;

import com.patterns.Creational.AbstractFactory.Ingredients.Calm.Calm;
import com.patterns.Creational.AbstractFactory.Ingredients.Calm.FreshCalm;
import com.patterns.Creational.AbstractFactory.Ingredients.Cheese.Cheese;
import com.patterns.Creational.AbstractFactory.Ingredients.Cheese.ReggianoCheese;
import com.patterns.Creational.AbstractFactory.Ingredients.Dough.Dough;
import com.patterns.Creational.AbstractFactory.Ingredients.Dough.VeryThinCrustDough;
import com.patterns.Creational.AbstractFactory.Ingredients.Pepperoni.Pepperoni;
import com.patterns.Creational.AbstractFactory.Ingredients.Pepperoni.SimplePepperoni;
import com.patterns.Creational.AbstractFactory.Ingredients.Sauce.MarinaraSauce;
import com.patterns.Creational.AbstractFactory.Ingredients.Sauce.Sauce;
import com.patterns.Creational.AbstractFactory.Ingredients.Veggie.*;

public class NYIngredients implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Calm createCalm() {
        return new FreshCalm();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SimplePepperoni();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie viggie[]={new Tomato(),new Corn(),new Capsicum(),new Mushroom()};
        return viggie;
    }
}
