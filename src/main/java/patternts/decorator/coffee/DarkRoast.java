package patternts.decorator.coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description  = "Dar Roast coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
