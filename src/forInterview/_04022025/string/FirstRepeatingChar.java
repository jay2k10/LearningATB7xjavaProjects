package forInterview._04022025.string;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "mydaughternameispranavi";
        System.out.println(str.length());

        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
                System.out.println("first repeating charactor is :"+c);
                break;
            }else{
                map.put(c,1);
            }

        }
        System.out.println(map);
    }
}
