package Jan2025.ex_27012025;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no i will tell you the factorial: ");
        int n = sc.nextInt();
        int fact =1;
        for (int i = 1; i<=n ;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
