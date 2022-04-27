package com.patterns.Creational.AbstractFactory.Ingredients;

import com.patterns.Creational.AbstractFactory.Ingredients.Calm.Calm;
import com.patterns.Creational.AbstractFactory.Ingredients.Cheese.Cheese;
import com.patterns.Creational.AbstractFactory.Ingredients.Dough.Dough;
import com.patterns.Creational.AbstractFactory.Ingredients.Pepperoni.Pepperoni;
import com.patterns.Creational.AbstractFactory.Ingredients.Sauce.Sauce;
import com.patterns.Creational.AbstractFactory.Ingredients.Veggie.Veggie;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Cheese createCheese();
    public Sauce createSauce();
    public Calm createCalm();
    public Pepperoni createPepperoni();
    public Veggie[] createVeggies();

}
