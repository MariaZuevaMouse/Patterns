package patternts.structural.proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class MatchMakingTestDrive {
    Hashtable<String, PersonBean> datingDB = new Hashtable();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    private void drive() {
        PersonBean mz = getPersoneFromDatabase("Mari Javabean");
        PersonBean ownerProxy = getOwnerProxy(mz);
        System.out.println("Name is " +ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        try{
            ownerProxy.setHotOrNotRation(10);
        }catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNotOwnerProxy(mz);
        System.out.println("Name is " + nonOwnerProxy.getName());

        try{
            nonOwnerProxy.setInterests("bowling, Go");
        }catch (Exception e){
            System.out.println("Can not set interests from no owner proxy");
        }

        nonOwnerProxy.setHotOrNotRation(9);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    PersonBean getNotOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NotOwnerInvocationHandler(person)
        );
    }

    PersonBean getPersoneFromDatabase(String name){
        return (PersonBean) datingDB.get(name);
    }

    private void initializeDatabase() {
        PersonBean mz = new PersonBeanImpl();
        mz.setName("Mari Javabean");
        mz.setInterests("cars, computers, music");
        mz.setHotOrNotRation(7);
        datingDB.put(mz.getName(), mz);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRation(6);
        datingDB.put(kelly.getName(), kelly);
    }
}

