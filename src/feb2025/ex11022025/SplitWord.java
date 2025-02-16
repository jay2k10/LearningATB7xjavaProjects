package feb2025.ex11022025;

public class SplitWord {
    public static void main(String[] args) {
        String s = "i love my india";
        String[] s2 = s.split("\s");
        //String s3 = s2.toString();
        for (String o : s2) {
            System.out.println(o);

        }
    }
}
