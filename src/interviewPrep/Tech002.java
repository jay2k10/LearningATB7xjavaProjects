package interviewPrep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tech002 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("J");
        mylist.add("A");
        mylist.add("Y");
        mylist.add("S");

        Iterator<String> itr = mylist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
