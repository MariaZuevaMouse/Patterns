package patternts.combine.combining.observer6;

public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }
}
