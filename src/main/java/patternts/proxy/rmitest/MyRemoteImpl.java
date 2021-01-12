package patternts.proxy.rmitest;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return null;
    }

    public static void main(String[] args) {
//        try{
//            LocateRegistry.createRegistry(2099);
//            MyRemote service = new MyRemoteImpl();
//            Naming.rebind("RemoteHello", service);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
