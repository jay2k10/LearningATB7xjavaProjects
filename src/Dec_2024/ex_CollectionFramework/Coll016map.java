package Dec_2024.ex_CollectionFramework;

import java.util.*;

public class Coll016map {
    public static void main(String[] args) {
        //Map m1 = new HashMap();
        //Map m1 = new LinkedHashMap();
        //Map m1 = new TreeMap();
        Map m1 = new WeakHashMap();
        m1.put("name", "jay");
        m1.put("id", 2);
        m1.put("phone", 7827299);
        System.out.println(m1);
    }
}
