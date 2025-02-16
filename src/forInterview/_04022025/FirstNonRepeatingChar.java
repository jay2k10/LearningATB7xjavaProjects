package forInterview._04022025;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "character";
        Set set = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++)
        set.add(str.charAt(i));
        Iterator itr = set.iterator();
        while (itr.hasNext())
        System.out.println(itr.next());

    }
}
