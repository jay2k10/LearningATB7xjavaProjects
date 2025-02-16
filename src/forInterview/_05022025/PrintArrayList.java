package forInterview._05022025;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jay");
        list.add("shankar");
        list.add("naman");
        list.add("priya");
        System.out.println(list.size());
        for(Object s :list){
            System.out.println(s);

        }
        list.add(1,"jay");
        System.out.println(list);
    }
}
