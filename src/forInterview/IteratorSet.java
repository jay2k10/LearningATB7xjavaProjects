package forInterview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("jay");
        s.add("Shankar");
        s.add("Naman");
        s.add("Priya");
        System.out.println("Before Iterator:");
        System.out.println(s);
        Iterator i = s.iterator();
        System.out.println("Iterator value are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
