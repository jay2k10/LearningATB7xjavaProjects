package ex_31012025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "Jay Shankar Prasad";

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i =0;i<str.length();i++)
            set.add(str.charAt(i));
            for(Character ch :set)
                System.out.println(ch);


    }
}
