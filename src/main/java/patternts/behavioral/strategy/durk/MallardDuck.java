package patternts.behavioral.strategy.durk;

import patternts.behavioral.strategy.flyPossibility.FlyWithWings;
import patternts.behavioral.strategy.quackPossibility.Quack;

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
