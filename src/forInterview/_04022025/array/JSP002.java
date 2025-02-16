package forInterview._04022025.array;

import java.util.Scanner;

public class JSP002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no i will tell yoy it is even or odd: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {

            System.out.println("No is even");
        }else{
            System.out.println("Odd no");
        }
    }
}
