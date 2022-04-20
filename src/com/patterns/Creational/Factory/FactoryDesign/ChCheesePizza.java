package com.patterns.Creational.Factory.FactoryDesign;

public class ChCheesePizza extends Pizza{


    ChCheesePizza(){
        pizzaName="ChCheesePizza";
        pizzaDough="Thin && Crispy";
        pizzaSauce="Chilli Sauce";
        //toppings.add("corns");
        toppings.add("pepper");
        toppings.add("Tomato");
        toppings.add("cheery");
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
        System.out.println("Baking you Pizza at 270~ C");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting your Pizza at into 8 pieces");
    }

}
