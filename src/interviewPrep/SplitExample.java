package interviewPrep;

public class SplitExample {
    public static void main(String[] args) {
        String s1 = "may name is Jay Shankar";
        System.out.println("Before split :" + s1);
        String[] word = s1.split("\\s");
        System.out.println("After Split");
        for (String w : word) {
            System.out.println(w);
        }

    }
}
