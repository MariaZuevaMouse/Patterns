package patternts.creational.factory.abstractFactory.IngridientFactory;

import patternts.creational.factory.abstractFactory.pizzaAdditions.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
