package August.ex_17082024.exceptations;

public class Lab214 {
    public static void main(String[] args) {
        try {;
            String s1 = "JayShankar";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is a problem with the code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of program");
    }
}
