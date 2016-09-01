package com.tulh.sample.decorator;

/**
 * Created by tulh on 04/01/2016.
 */
public class BasicPizza implements Pizza
{
    @Override
    public String bakePizza()
    {
        return "Basic Pizza";
    }
}
