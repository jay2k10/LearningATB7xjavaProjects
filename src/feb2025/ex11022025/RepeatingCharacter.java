package feb2025.ex11022025;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacter {
    public static void main(String[] args) {
        String s = "jaya";
        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else {
                map.put(c,1);

            }

        }
        for (int i = 0; i <s.length(); i++) {
            Character c2 = s.charAt(i);
            if(map.get(c2)>1){
                System.out.println("Repeating character is :"+c2);
                break;
            }

        }
        System.out.println(map);
    }
}
