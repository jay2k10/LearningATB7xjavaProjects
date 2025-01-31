package Jan2025.ex_27012025;

public class A011 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }else{
                System.out.println("No Output");
            }

        }
    }
}
