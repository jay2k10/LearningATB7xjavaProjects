package Jan2025;

public class LocalInstance {

    int age = 45;//instance Variable


    void f1() {
        int age = 32;//Local Variable
        System.out.println(age);
    }

    void f2() {
        int age = 50;
        System.out.println(age);
    }
}
