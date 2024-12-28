package Dec_2024.ex_CollectionFramework;

public class Coll013 {
    public static void main(String[] args) {
        Person p1 = new Person(1, "jay");
        Person p2 = new Person(2, "Shankar");
        System.out.println(p1);
        System.out.println(p2);


    }
}

class Person extends Object {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID ->" + id + " , Name ->" + name;
    }
}
