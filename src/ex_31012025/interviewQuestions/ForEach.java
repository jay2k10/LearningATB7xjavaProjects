package ex_31012025.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jay");
        list.add(1);
        list.add("Rose");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));

        }
    }
}
