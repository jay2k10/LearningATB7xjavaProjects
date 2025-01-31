package ex_31012025;

public class Son extends Father {
    void home3(){
        System.out.println("3BHK");
        System.out.println(gold);
    }

    public static void main(String[] args) {
        new Son().home3();
        new Son().home2();
    }
}
