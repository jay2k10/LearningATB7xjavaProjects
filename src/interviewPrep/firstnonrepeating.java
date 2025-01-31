package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class firstnonrepeating {

    public static void main(String[] args) {

        String s1 = "character";

        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {

            if (m.get(s1.charAt(i)) != null) {
                m.put(s1.charAt(i), m.get(s1.charAt(i)) + 1);
            } else {
                m.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s1.length(); i++) {

            if (m.get(s1.charAt(i)) == 1) {
                System.out.println("First Non Reapeating Character is "
                        + s1.charAt(i));
                break;
            } else {
                if (i == s1.length() - 1)
                    System.out.println("No non repeating Character");
            }
        }

    }

}
