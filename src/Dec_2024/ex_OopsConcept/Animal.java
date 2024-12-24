package Dec_2024.ex_OopsConcept;

public class Animal {
    String name = "lol";
    String color;


    void walk(){

    }
    void talk(){

    }

    public static void main(String[] args) {
        Animal A1 = new Animal();
        Animal A2 = new Animal();
        Animal A3 = A2;


        System.out.println(A1.name);
        System.out.println(A2.name);
        System.out.println(A3.name);
    }
}
