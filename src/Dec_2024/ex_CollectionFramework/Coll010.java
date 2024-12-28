package Dec_2024.ex_CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Coll010 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "jay");
        Student s2 = new Student(2, "jay1");
        Student s3 = new Student(3, "jay2");
        Student s4 = new Student(4, "jay3");

        List list = new LinkedList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list);
    }
}

class Student {
    Integer id;
    String name;

    public Student(Integer id, String name) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
