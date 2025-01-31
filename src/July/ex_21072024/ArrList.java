package July.ex_21072024;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(5);
        a.add(20);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

    }
}
