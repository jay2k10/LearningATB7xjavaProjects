package July.ex_21072024;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of factorial :");
        int n = sc.nextInt();

        int fact =1;
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
            
        }
        System.out.println(fact);
        sc.close();
    }
}
