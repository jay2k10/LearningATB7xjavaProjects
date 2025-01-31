package ex_31012025.interviewQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ItrSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet();
        s1.add("Jay");
        s1.add("Prasad");
        s1.add("Shankar");
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
