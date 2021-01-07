package patternts.combine.combining.observer6;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck +" just quacked");
    }
}
