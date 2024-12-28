package Dec_2024.ex_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Coll011 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(14);
        arrayList.add(50);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(70);
        System.out.println("Array List:"+arrayList);

        Collections.sort(arrayList); // natural sorting with integer
        System.out.println("With Sort:"+arrayList);


        ArrayList names = new ArrayList();
        names.add("jay");
        names.add("shree");
        names.add("Ajay");
        names.add("Naman");
        System.out.println("Array List:"+names);
        Collections.sort(names); //Sorting with alphabet
        System.out.println("With Sort:"+names);
    }
}
