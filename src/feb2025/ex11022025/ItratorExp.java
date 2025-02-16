package feb2025.ex11022025;

import java.util.HashSet;
import java.util.Iterator;

public class ItratorExp {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("jay");
        set.add("naman");
        set.add("pranavi");
        set.add("Tejaswini");

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}