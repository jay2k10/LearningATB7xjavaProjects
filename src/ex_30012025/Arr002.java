package ex_30012025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arr002 {
    public static void main(String[] args) {
        //List<Integer> list= new ArrayList();
        List list = new ArrayList();
        list.add(10);
        list.add(7);
        list.add(15);
        list.add(3);

//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        for(Object o:list){
            System.out.println(o);

        }
    }
}
