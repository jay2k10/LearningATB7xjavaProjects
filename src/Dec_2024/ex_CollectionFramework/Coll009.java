package Dec_2024.ex_CollectionFramework;

import java.util.Stack;

public class Coll009 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push("jay");
        s1.add("Shankar");
        s1.add("Prasad");
        System.out.println(s1);
        System.out.println(s1.peek()); //peaking the last element
        System.out.println(s1);
        System.out.println(s1.pop()); //Removing the last element
        System.out.println(s1);

    }
}
