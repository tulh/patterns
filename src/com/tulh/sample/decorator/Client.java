package com.tulh.sample.decorator;

/**
 * Created by tulh on 04/01/2016.
 */
public class Client
{
    public static void main(String args[])
    {
        Pizza pizza = new ChickenTikkaPizza(new BasicPizza());
        System.out.println(pizza.bakePizza());

        System.out.println(Pizza2Decorator.bakePizza(new BasicPizza2(), Pizza2::withChickenTikka, Pizza2::withProsciutto));
        System.out.println(Pizza2Decorator.bakePizza(new BasicPizza2()));
        System.out.println(Pizza2Decorator.bakePizza(new BasicPizza2(), Pizza2::withProsciutto));
    }
}
