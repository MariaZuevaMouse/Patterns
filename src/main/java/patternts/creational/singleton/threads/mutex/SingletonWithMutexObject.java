package patternts.creational.singleton.threads.mutex;

public class SingletonWithMutexObject {
    private static volatile SingletonWithMutexObject instance;
    private static Object mutex = new Object();

    private SingletonWithMutexObject() {
    }

    public static SingletonWithMutexObject getInstance() {
        SingletonWithMutexObject result = instance;
        if(result ==null){
            synchronized (mutex){
                result = instance;
                if(result==null)
                    instance = result = new SingletonWithMutexObject();
            }
        }
        return result;
    }
}
