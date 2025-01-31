package ex_30012025;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        //System.out.println(str);

        Set<Character> repeatingChar= new HashSet<>();
        List<Character> nonRepeating= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(repeatingChar.contains(ch)){
                continue;
            }
            if(nonRepeating.contains(ch)){
                nonRepeating.remove((Character) ch);
                repeatingChar.add(ch);
            }else {
                nonRepeating.add(ch);
            }
            
        }
        if(!nonRepeating.isEmpty()){
            char firstChar = nonRepeating.get(0);
            System.out.println("The first character which is not repeating is: "+firstChar);
        }
        else{
            System.out.println("There is no repeating character in string");
        }

    }
}
