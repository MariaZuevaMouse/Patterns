package patternts.creational.factory.pizzaSimple;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String  dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public  void prepare(){
        System.out.println("Preparing " + name);
    }

    public  void bake(){
        System.out.println("Backing " + name);
    }

    public void cut(){
        System.out.println("Cutting" + name);
    }
    public void box(){
        System.out.println("Boxing" +name);
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("___" + name + "___\n" );
        display.append(dough +"\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String) toppings.get(i) +"\n");
        }
        return display.toString();
    }
}
