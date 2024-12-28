package Dec_2024.ex_exceptionalHandling26122024;

public class Lab00001 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Div by zero");
        } finally {
            System.out.println("I will be executed any how!!");
        }


    }
}
