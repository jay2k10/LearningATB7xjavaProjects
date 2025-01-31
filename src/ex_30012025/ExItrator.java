package ex_30012025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExItrator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jay");
        list.add(1);
        list.add("XYZ");
        System.out.println(list);

//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for(Object o : list){
            System.out.println(o);
        }
    }
}
