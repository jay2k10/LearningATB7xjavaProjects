package Dec_2024.ex_exceptionalHandling26122024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab00006 {
    public static void main(String[] args) throws FileNotFoundException {
        extracted();
    }

    private static void extracted() throws FileNotFoundException {
        String file = "D:/b.png";
        File f = new File(file);
        FileReader fileReader = new FileReader(f);
        System.out.println("File not found");
    }
}
