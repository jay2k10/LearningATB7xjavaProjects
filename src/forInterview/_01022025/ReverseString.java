package forInterview._01022025;

public class ReverseString {
    public static void main(String[] args) {
        String str1 = "My name is jay";
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        String str2 = sb.toString();
        System.out.println(str2);
    }

}
