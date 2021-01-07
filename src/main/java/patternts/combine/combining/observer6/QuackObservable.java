package patternts.combine.combining.observer6;



public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
