package feb2025.ex11022025;

import java.util.HashMap;
import java.util.Map;

public class JSP002 {
    public static void main(String[] args) {
        String str = "i live in delhi";

        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }

        }
        System.out.println(map);
    }
}
