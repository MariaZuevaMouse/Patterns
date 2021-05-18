package patternts.behavioral.strategy.durk;

import patternts.behavioral.strategy.flyPossibility.FlyBehavior;
import patternts.behavioral.strategy.quackPossibility.QuackBehavior;

public abstract class Durk {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Durk() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
