package patternts.factory.abstractFactory.pizzaAdditions;

import patternts.factory.abstractFactory.pizzaAdditions.Veggies;

public class Mushroom implements Veggies {
    @Override
    public String toString() {
//        return "Mushroom{}";
        return getClass().getName().toString();
    }
}
