package Dec_2024.ex_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coll007 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("Jay");
        myList.add("Shankar");
        myList.add("Prasad");

        System.out.println("-----------1st Output------------");

        for(String str : myList){
            System.out.println(str);
        }

        System.out.println("-----------2nd Output------------");
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));

        }
        System.out.println("-----------3st Output------------");
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
