package Dec_2024.ex_CollectionFramework;

import java.util.*;

public class Col0014set {
    public static void main(String[] args) {
        //Link - Duplicate allow
        //Set - Doesn't allow duplicate

        Set hs = new HashSet(); //hashing mechanism to store teh element means no order.


        hs.add("Apple");
        hs.add("orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        System.out.println(hs);

        Set lhs = new LinkedHashSet(); //Linkedlist mechanism to store the element, order will maintain
        lhs.add("Apple");
        lhs.add("orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        System.out.println(lhs);
        System.out.println(lhs.contains("Orange"));
        System.out.println(lhs.size());

        Set ts = new TreeSet(); // sort them automatically on the basis of first letter
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("orange");
        ts.add("WaterMelon");
        System.out.println(ts);

        for (Object o : ts) {
            System.out.println(o);
        }

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
