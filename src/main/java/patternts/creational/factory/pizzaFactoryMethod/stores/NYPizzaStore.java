package patternts.creational.factory.pizzaFactoryMethod.stores;

import patternts.creational.factory.pizzaFactoryMethod.*;
import patternts.creational.factory.pizzaFactoryMethod.Pizza.*;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new NYStyleCheesePizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new NYStyleVeggiePizza();
        } else if (type.equals(PizzaType.CLAM)) {
            return new NYStyleClamPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
