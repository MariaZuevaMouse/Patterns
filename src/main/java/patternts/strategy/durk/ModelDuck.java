package patternts.strategy.durk;

import patternts.strategy.flyPossibility.FlyNoWay;
import patternts.strategy.quackPossibility.Quack;

public class ModelDuck extends Durk {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
