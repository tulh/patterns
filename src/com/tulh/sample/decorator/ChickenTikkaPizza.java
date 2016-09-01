package com.tulh.sample.decorator;

/**
 * Created by tulh on 04/01/2016.
 */
public class ChickenTikkaPizza extends PizzaDecorator
{
    public ChickenTikkaPizza(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String bakePizza()
    {
        return pizza.bakePizza() + " with chicken topping added";
    }
}
