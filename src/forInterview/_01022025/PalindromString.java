package forInterview._01022025;

public class PalindromString {
    public static void main(String[] args) {
        String str = "naman";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        System.out.println(str1);
        if (str.equals(str1)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not a palindron string");
        }

    }


}
