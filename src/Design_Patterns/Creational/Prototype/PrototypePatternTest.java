package Design_Patterns.Creational.Prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use clone to get employees object
        Employees empNew = (Employees) emps.clone();
        Employees empNew1 = (Employees) emps.clone();

        List<String> list = empNew.getEmpList();
        list.add("Sohan");

        List<String> list1 = empNew1.getEmpList();
        list1.remove("Shyam");

        System.out.println("Original List : "+emps.getEmpList());
        System.out.println("List : "+list);
        System.out.println("List 1 :"+list1);

    }
}
