package Dec_2024.wrapperClasses;

public class W3 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        a1.m2();
        a.age = 10;
        System.out.println(A.discount);
        A.m1();
    }
}

class A {
    int age = 10;
    static int discount = 100;

    //SIB - Static initialization block

    static {
        System.out.println("SIB-A");
    }
    //IIB - Instance initialization block

    {
        System.out.println("IIB");
    }

    static void m1() {
        System.out.println("M1");
    }

    void m2() {
        System.out.println("M2");
        System.out.println(discount);
    }
}