package August.ex_18082024;

public class Lab218 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]); //UnChecked- ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            //fileclose, sc.close, sqlconnection.close
            System.out.println("End of the program !!");
        }

    }
}
