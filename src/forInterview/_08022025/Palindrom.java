package forInterview._08022025;

public class Palindrom {
    public static void main(String[] args) {
        String str = "naman";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str2 = sb.toString();
        if(str2.equals(str)){
            System.out.println("palindron");
        }
        else{
            System.out.println("Not a palindrom");
        }
    }
}
