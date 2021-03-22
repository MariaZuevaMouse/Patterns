package patternts.creational.factory.pizzaFactoryMethod.stores;

import patternts.creational.factory.pizzaFactoryMethod.*;
import patternts.creational.factory.pizzaFactoryMethod.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals(PizzaType.CLAM)) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
