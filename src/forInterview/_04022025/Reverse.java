package forInterview._04022025;

public class Reverse {
    public static void main(String[] args) {
        String str = "i am jay";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str2 = sb.toString();
        System.out.println(str2);
    }
}
