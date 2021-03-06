package patternts.creational.singleton.threads.staticInstance;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
}
