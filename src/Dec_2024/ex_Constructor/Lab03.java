package Dec_2024.ex_Constructor;

public class Lab03 {

    int e = 45; // Instance variable !=Global Variable

    void f1() {
        int e = 56;   // Local variable
        System.out.println(e);
    }

    void f2() {
        System.out.println(e);
    }

}
