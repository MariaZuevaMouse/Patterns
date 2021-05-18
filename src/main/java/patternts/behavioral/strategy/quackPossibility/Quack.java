package patternts.behavioral.strategy.quackPossibility;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
