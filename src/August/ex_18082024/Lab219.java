package August.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219 {
    public static void main(String[] args) {
        String path = "c://downloads/a.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception!!");
        }catch (Exception e){
            System.out.println("Exception!!");
        }
    }
}
