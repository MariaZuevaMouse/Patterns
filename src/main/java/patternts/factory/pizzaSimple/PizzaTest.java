package patternts.factory.pizzaSimple;

public class PizzaTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        System.out.println("We order a " +pizza.getName() + "\n");

        pizza = store.orderPizza(PizzaType.PEPPERONI);
        System.out.println("We order a " +pizza.getName() + "\n");

        pizza = store.orderPizza(PizzaType.CLAM);
        System.out.println("We order a " +pizza.getName() + "\n");

        pizza = store.orderPizza(PizzaType.VEGGIE);
        System.out.println("We order a " +pizza.getName() + "\n");
    }
}
