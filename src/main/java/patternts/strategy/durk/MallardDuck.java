package patternts.strategy.durk;

import patternts.strategy.flyPossibility.FlyWithWings;
import patternts.strategy.quackPossibility.Quack;

public class MallardDuck extends Durk {
    @Override
    public void display() {
        System.out.println("I'm a real Millard duck!");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
