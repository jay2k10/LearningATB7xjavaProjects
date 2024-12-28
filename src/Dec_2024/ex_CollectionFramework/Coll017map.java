package Dec_2024.ex_CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Coll017map {
    public static void main(String[] args) {
        Map<String, Integer> m2 = new HashMap();
        m2.put("ID", 1);
        m2.put("ID1", 2);
        m2.put(null, 101);
        m2.put(null, 100);
        m2.put("ID2", null);
        m2.put("ID3", null);


        System.out.println(m2.isEmpty());
        System.out.println(m2.size());
        System.out.println(m2.containsKey("ID2"));
        System.out.println(m2.containsValue(2));
        System.out.println(m2.keySet());
        System.out.println(m2.values());
        System.out.println(m2.get("ID1"));


        System.out.println("--------Print Iterator-------------");
        //How to iterate over all the elements in the map.

        for (Map.Entry<String, Integer> item : m2.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
