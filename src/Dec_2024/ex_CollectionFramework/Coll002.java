package Dec_2024.ex_CollectionFramework;

import java.util.ArrayList;

public class Coll002 {
    public static void main(String[] args) {
        //int  [] a = {1,2,3,4,5};
       /* int[] a = new int[5];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 4) {
                System.out.println(".....");
            } *//*else {
                System.out.println("XXXXXXX");
            }*//*

        }*/

        ArrayList arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.contains(4));
    }
}
