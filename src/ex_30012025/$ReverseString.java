package ex_30012025;

public class $ReverseString {
    public static void main(String[] args) {
        String st1 ="i am jay";
        StringBuilder sb = new StringBuilder(st1);
        //sb.append(st1);
        sb.reverse();
        System.out.println(sb);
    }
}
