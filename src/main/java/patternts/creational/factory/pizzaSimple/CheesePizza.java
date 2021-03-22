package patternts.creational.factory.pizzaSimple;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
