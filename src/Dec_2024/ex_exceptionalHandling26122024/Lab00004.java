package Dec_2024.ex_exceptionalHandling26122024;

public class Lab00004 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer [] i = new Integer[2]; //Unchecked -ArrayIndexOutOfBoundsException
            //int [] i = {1,2,3};
            System.out.println(i[4]);
        } catch (Exception e) {
            System.out.println("Array index out of bound exception");
        }finally {
            System.out.println("End of the program");
        }
    }
}
