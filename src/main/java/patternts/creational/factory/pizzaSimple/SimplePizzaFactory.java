package patternts.creational.factory.pizzaSimple;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;

        if(type.equals(PizzaType.CHEESE)){
            pizza = new CheesePizza();
        }else if(type.equals(PizzaType.PEPPERONI)){
            pizza = new PepperoniPizza();
        }else if(type.equals(PizzaType.CLAM)){
            pizza = new ClamPizza();
        }else if(type.equals(PizzaType.VEGGIE)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
