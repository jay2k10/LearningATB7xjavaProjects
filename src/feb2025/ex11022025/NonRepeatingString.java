package feb2025.ex11022025;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingString {
    public static void main(String[] args) {
        String s = "character";

        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);

            }else {
                map.put(c,1);
            }

        }
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            if(map.get(c1)==1){
                System.out.println("Non Repeating charactor is :"+c1);
                break;
            }

        }
        System.out.println(map);
    }
}
