package patternts.creational.singleton.threads.conditionalLock;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
