package patternts.creational.singleton.innerstatichelper;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private  static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
