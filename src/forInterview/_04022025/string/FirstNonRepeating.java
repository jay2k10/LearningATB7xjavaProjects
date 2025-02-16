package forInterview._04022025.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "mydaughternameispranavi";
        System.out.println(str.length());
        Map<Character,Integer> map = new HashMap();
        for(int i = 0;i<str.length();i++){
            Character c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        for (int j = 0; j < str.length(); j++) {
            Character c1 = str.charAt(j);
            if(map.get(c1)==1){
                System.out.println("Non repeating char :"+c1);
                break;

            }

        }
        System.out.println(map);
    }



}
