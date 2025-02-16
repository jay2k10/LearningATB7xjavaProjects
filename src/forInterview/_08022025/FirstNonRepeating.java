package forInterview._08022025;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "greek of greeks";

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }


                }
        for (int j = 0; j < str.length(); j++) {
            char c1 = str.charAt(j);
            if(map.get(c1)==1){
                System.out.println("First non repeating "+c1);
                break;


            }

        }

    }
}
