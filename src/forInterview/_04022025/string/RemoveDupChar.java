package forInterview._04022025.string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupChar {
    public static void main(String[] args) {
        String s1 ="jayshankar";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s1.length(); i++)
            set.add(s1.charAt(i));
        for(Character s :set)
            System.out.println(s);
    }
}
