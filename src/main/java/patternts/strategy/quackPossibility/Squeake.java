package patternts.strategy.quackPossibility;

public class Squeake implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
