package Dec_2024.ex_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coll012 {
    public static void main(String[] args) {
        Employee e1 = new Employee(4, "sharma4");
        Employee e2 = new Employee(2, "Namam4");
        Employee e3 = new Employee(1, "Chitwan1");
        Employee e4 = new Employee(3, "Ajay3");

        ArrayList arrayList = new ArrayList();
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        System.out.println(arrayList);
        //Collections.sort(arrayList); //Comparable
        Collections.sort(arrayList, new SortByID());
        //Collections.sort(arrayList, new SortByName());
        Collections.sort(arrayList,new SortByNameDesc());
        System.out.println(arrayList);

    }
}

class SortByName implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByID implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
class SortByNameDesc implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

//class Employee implements Comparable<Employee>{
class Employee {
    Integer id;
    String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Employee anotherName) {
//        return CharSequence.compare(this.name,anotherName.name);
//    }

//    @Override
//    public int compareTo(Employee o) {
//        return Integer.compare(this.id,o.id);
//    }


}
