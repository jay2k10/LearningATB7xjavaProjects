package forInterview._05022025;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int c = 20;

        if(a>b && a>c){
            System.out.println("greatest value is "+a);
        } else if (b>a && b>c) {
            System.out.println("greatest value is "+b);

        }else{
            System.out.println("greatest value is "+c);
        }
    }
}
