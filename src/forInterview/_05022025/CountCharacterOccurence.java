package forInterview._05022025;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        String s = "Java is java again java again";
        System.out.println("Total String Count is :"+s.length());

        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else {
                map.put(c,1);
            }

        }
        System.out.println(map);
    }
}
