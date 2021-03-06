package patternts.creational.factory.pizzaFactoryMethod;

import patternts.creational.factory.pizzaFactoryMethod.Pizza.Pizza;
import patternts.creational.factory.pizzaFactoryMethod.stores.ChicagoPizzaStore;
import patternts.creational.factory.pizzaFactoryMethod.stores.NYPizzaStore;
import patternts.creational.factory.pizzaFactoryMethod.stores.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.CLAM);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
