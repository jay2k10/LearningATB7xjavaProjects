package ex_30012025;

public class PalSTR {
    public static void main(String[] args) {
        String str = "anna";
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.toString();
        if (str.equals(str1)) {

            System.out.println("Palindrom");
        }else {
            System.out.println("Not palindron");
        }
    }
}
