package Dec_2024.ex_exceptionalHandling26122024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab00005 {
    public static void main(String[] args) {
        String path = "C://a.png";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found !!");
        }
    }
}
