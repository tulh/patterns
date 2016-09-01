package com.tulh.sample.decorator;

/**
 * Created by tulh on 04/01/2016.
 */
public abstract class PizzaDecorator implements Pizza
{
    Pizza pizza;

    public PizzaDecorator(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String bakePizza()
    {
        return pizza.bakePizza();
    }
}
