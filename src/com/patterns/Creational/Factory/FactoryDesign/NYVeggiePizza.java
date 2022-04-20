package com.patterns.Creational.Factory.FactoryDesign;

public class NYVeggiePizza extends Pizza{


    NYVeggiePizza(){
        pizzaName="NYVeggiePizza";
        pizzaDough="Thin && Crust";
        pizzaSauce="Tomato Sauce";
        toppings.add("corns");
        toppings.add("pepper");
        toppings.add("Tomato");
    }

    @Override
    protected void prepare() {
        System.out.println("preparing you "+pizzaName );
        System.out.println("Adding "+pizzaDough +" Dough");
        System.out.println("Adding "+pizzaSauce);
        System.out.print("Adding topping : ");
        for (int i=0;i< toppings.size();i++){
            System.out.print(" "+toppings.get(i));
        }
        System.out.println();
    }

    @Override
    protected void bake() {
        System.out.println("Baking you Pizza at 250~ C");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting your Pizza at into 6 pieces");
    }

}
