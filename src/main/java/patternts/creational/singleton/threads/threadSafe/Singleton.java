package patternts.creational.singleton.threads.threadSafe;

public class Singleton {
    private static Singleton uniqueInstance;

    public Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
