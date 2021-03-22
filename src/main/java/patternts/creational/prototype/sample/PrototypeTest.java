package patternts.creational.prototype.sample;

import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();

        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Lisa");

        System.out.println("emps list: " + emps.getEmpList());
        System.out.println("empsNew list: " + list);
        System.out.println("empsNew1 list: " + list1);
    }
}
