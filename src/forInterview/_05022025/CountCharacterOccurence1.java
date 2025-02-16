package forInterview._05022025;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CountCharacterOccurence1 {
    public static void main(String[] args) {
        String s = "Java is java again java again";
        String s1 = s.toLowerCase();
        Set<String> set = new HashSet();
        for (int i = 0; i < s1.length(); i++) {

            set.add(Objects.toString((s1.charAt(i))));
        }

        for (String ch : set) {
            int count = s1.length() - s1.replace(ch.toString(), "").length();
            System.out.println(ch + " = " + count);

        }
    }
}
