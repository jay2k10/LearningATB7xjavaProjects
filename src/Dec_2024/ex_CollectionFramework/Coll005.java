package Dec_2024.ex_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Coll005 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(95);
        marks.add(96);
        marks.add(60);
        marks.add(100);
        System.out.println(marks);
        //Collections.sort(marks);
        Collections.sort(marks,Comparator.reverseOrder());
        System.out.println(marks);
    }
}
