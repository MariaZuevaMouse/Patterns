package patternts.singleton.threads.staticInstance;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
}
