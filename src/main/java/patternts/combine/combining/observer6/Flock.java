package patternts.combine.combining.observer6;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}
