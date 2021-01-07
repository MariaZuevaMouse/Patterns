package patternts.combine.combining.observer6;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
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
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public String toString() {
        return "DuckCall";
    }
}
