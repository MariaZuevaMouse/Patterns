package patternts.creational.factory.pizzaFactoryMethod.stores;

import patternts.creational.factory.pizzaFactoryMethod.Pizza.Pizza;
import patternts.creational.factory.pizzaFactoryMethod.PizzaType;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type){
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " +pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
