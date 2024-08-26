package August.ex_17082024.exceptations;

public class Lab215 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        int x = 0;
        try {
            x = 10/a;
        } catch (Exception e) {
            System.out.println("Airemathic error");
        } finally {
        }
        System.out.println("I will exit any how!!");
    }
}
