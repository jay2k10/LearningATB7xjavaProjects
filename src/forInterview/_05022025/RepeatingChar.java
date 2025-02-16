package forInterview._05022025;

import java.util.HashMap;
import java.util.Map;

public class RepeatingChar {
    public static void main(String[] args) {
        String str = "character";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for (int j = 0; j < str.length(); j++) {
            Character c1 = str.charAt(j);
            if (map.get(c1) >= 1) {
                System.out.println("First repeating charactor :" + c1);
                break;
            }

        }
    }
}
