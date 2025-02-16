package feb2025.ex11022025;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
       String str1 ="automation";
       Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);

            }else {
                map.put(c,1);
            }

        }
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            if(map.get(c)>1){
                System.out.println(c);


            }

        }
        System.out.println(map);
    }
}
