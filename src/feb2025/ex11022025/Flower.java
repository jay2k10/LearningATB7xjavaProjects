package feb2025.ex11022025;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Rose");
        list.add("Lily");
        list.add("SunFlower");
        list.add("Merigild");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
