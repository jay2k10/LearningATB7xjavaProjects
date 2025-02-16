package forInterview._04022025.string;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
        String str = "My name is jay shankar prasad";
        String str1= str.toLowerCase();
        System.out.println(str1.length());
        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < str1.length() ; i++) {
            Character c = str1.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }

        }
        System.out.println(map);
    }
}
