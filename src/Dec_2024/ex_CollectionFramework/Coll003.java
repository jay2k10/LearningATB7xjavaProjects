package Dec_2024.ex_CollectionFramework;

import java.util.List;

public class Coll003 {
    public static void main(String[] args) {
        List shopping_list = List.of("banana","Apple","Guava");
        System.out.println(shopping_list.getFirst());
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        shopping_list.add("milk");

    }
}
