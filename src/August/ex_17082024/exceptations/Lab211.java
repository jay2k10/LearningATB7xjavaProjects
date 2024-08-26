package August.ex_17082024.exceptations;

public class Lab211 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("Divide by zero");
        }
        System.out.println(a);
    }
}
