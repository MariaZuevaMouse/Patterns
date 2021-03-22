package patternts.creational.factory.abstractFactory.pizzaAdditions;

public class Mushroom implements Veggies {
    @Override
    public String toString() {
//        return "Mushroom{}";
        return getClass().getName().toString();
    }
}
