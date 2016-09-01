package com.tulh.sample.decorator;

/**
 * Created by tulh on 04/01/2016.
 */
public interface Pizza2
{
    String bakePizza();

    static Pizza2 withChickenTikka(Pizza2 pizza) {
        return () -> pizza.bakePizza() + " with chicken";
    }

    static Pizza2 withProsciutto(Pizza2 pizza) {
        return () -> pizza.bakePizza() + " with prosciutto";
    }
}

