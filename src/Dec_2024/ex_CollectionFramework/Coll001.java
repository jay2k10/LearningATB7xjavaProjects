package Dec_2024.ex_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Coll001 {
    public static void main(String[] args) {
        //Collection framework
        //Collection is an interface
        //Collection(I) - List(I) - we can't create an object of Interface
        //List(I) - ArrayList, Linked List, Vector, Stack

        // List mylist = new ArrayList(); //Dynamic dispatch
        // Collection myList2 = new ArrayList(); //Dynamic dispatch

        ArrayList myList3 = new ArrayList();
        myList3.add("jay");
        myList3.add("Shankar");
        myList3.add("Prasad");
        myList3.add(123);
        myList3.add(true);
        myList3.add(false);
        System.out.println(myList3); //[jay, Shankar, Prasad]
        System.out.println(myList3.size()); //6
        System.out.println(myList3.get(1));
        System.out.println(myList3.contains("jay"));
        System.out.println(myList3.contains("Bhavna"));

    }
}
