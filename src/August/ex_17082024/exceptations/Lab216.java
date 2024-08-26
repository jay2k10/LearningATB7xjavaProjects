package August.ex_17082024.exceptations;

public class Lab216 {
    public static void main(String[] amit) {
        try {
            int a =10/0;
        } catch (Exception e) {
            // e can be anything (Exception pramod)
            System.out.println("Div by 0");
        } finally {
            System.out.println("I will be always executed , any how !!");
        }
    }
}
