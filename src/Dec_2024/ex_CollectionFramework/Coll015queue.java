package Dec_2024.ex_CollectionFramework;

import java.util.PriorityQueue;

public class Coll015queue {
    //Queue -used less than 1% in Automation
    public static void main(String[] args) {
        PriorityQueue pe =new PriorityQueue();
        pe.offer("1"); //add
        pe.offer("3");
        pe.offer("4");
        pe.offer("2");
        System.out.println(pe);
        System.out.println(pe.peek());
        System.out.println(pe.poll());
        System.out.println(pe);

    }
}
