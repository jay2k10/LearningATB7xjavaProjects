package forInterview._04022025;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "jayshankar";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++)
            set.add(str.charAt(i));
        for(Character ch:set)
            System.out.println(ch);
    }
}
