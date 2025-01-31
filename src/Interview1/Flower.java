package Interview1;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    public static void main(String[] args) {
        List flower = new ArrayList();
        flower.add("Rose");
        flower.add("Lotus");
        flower.add("Lily");
        flower.add("SunFlower");
        flower.add("MeryGold");
        for(Object o :flower){
            System.out.println(o);
        }
    }
}
