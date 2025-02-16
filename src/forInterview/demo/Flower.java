package forInterview.demo;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    public static void main(String[] args) {
        List f = new ArrayList();
        f.add("Rose");
        f.add("Lotus");
        for (int i = 0; i < f.size(); i++) {
            System.out.println(f.get(i));

        }
//        for(Object o : f){
//            System.out.println(o);
//        }
    }
}
