package Dec_2024.ex_exceptionalHandling26122024;

public class Lab00002 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Div by Zero");
        } finally {
            System.out.println("I will be always executed!!");
        }
    }
}
