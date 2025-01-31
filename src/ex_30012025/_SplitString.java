package ex_30012025;

import java.util.Arrays;
import java.util.Iterator;

public class _SplitString {
    public static void main(String[] args) {
        String str1 = "Jay Shankar Prasad";
        System.out.println("Original String is :" + str1);
        String[] str2 = str1.split("\s");
//        for (String s : str2) {
//            System.out.println(s);
//
//        }
        Iterator itr = Arrays.stream(str2).iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}