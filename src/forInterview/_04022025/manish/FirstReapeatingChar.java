package forInterview._04022025.manish;

import java.util.HashMap;
import java.util.Map;

public class FirstReapeatingChar {
    public static void main(String[] args) {
        String str = "daughternameispranavi";
        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);

            }

            else{
                map.put(c,1);
            }

        }
        for (int i = 0; i < str.length(); i++) {
            Character c1 = str.charAt(i);
                    if(map.get(c1)>1){
                        System.out.println("First repeating: "+c1);
                        break;
                    }
            //System.out.println(c1);

        }
        System.out.println(map);
    }


}
