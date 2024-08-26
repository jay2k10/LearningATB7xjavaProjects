package August.ex_17082024.exceptations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab210 {
    public static void main(String[] args) {
        // Exception
        // Checked - JVM knows -
        /*try {
            FileInputStream file = new FileInputStream("http://c.log");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        //UnChecked

        try {
            int a =10;
            int c = a/0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error / by zero");
        }
        System.out.println("End of program");

    }
}
