package forInterview._01022025;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ItrSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("jay");
        set.add("Shankar");

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
