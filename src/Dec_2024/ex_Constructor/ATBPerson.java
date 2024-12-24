package Dec_2024.ex_Constructor;

public class ATBPerson {
    String name;
    long phone;

    ATBPerson(String name) {
        this.name = name;
    }

    ATBPerson(long phone) {
        this.phone = phone;
    }

    ATBPerson(String name, long phone) {
        this.name = name;
        this.phone = phone;

        //this basically means this class.
    }

    public ATBPerson() {
        System.out.println("Object is created!");
    }
}
