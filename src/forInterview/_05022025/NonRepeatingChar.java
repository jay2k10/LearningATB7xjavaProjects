package forInterview._05022025;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
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
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.get(c) == 1) {
                System.out.println("First non repeating char :" + c);
                break;
            }

        }
    }
}
