package August.ex_17082024.exceptations;

public class Lab212 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip = null; // ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bond exceptions");
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        try {
            int b = 1000 / a; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        System.out.println("End of the program");
    }
}