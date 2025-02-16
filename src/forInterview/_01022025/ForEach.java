package forInterview._01022025;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Lotus");
        myList.add("Rose");
        myList.add("sunflower");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }
    }
}

