package August.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "c:/download/a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(path);

    }
}
