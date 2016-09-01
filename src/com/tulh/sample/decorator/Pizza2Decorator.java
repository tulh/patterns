package com.tulh.sample.decorator;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by tulh on 04/01/2016.
 */
public class Pizza2Decorator
{
    private final Function<Pizza2, Pizza2> toppings;

    private Pizza2Decorator(Function<Pizza2, Pizza2>... desiredToppings) {
        this.toppings = Stream.of(desiredToppings)
                .reduce(Function.identity(), Function::andThen);

    }


    public static String bakePizza(Pizza2 pizza, Function<Pizza2, Pizza2>... desiredToppings) {
        return new Pizza2Decorator(desiredToppings).bakePizza(pizza);
    }

    private String bakePizza(Pizza2 pizza) {
        return this.toppings.apply(pizza).bakePizza();
    }

}
