package feb2025.ex11022025;

public class Palindrom {
    public static void main(String[] args) {
        String str = " anna ";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str2 = sb.toString();
        if(str.equals(str2)){
            System.out.println("Palindrom");

        }else{
            System.out.println("Not a palindrom");
        }
    }
}
