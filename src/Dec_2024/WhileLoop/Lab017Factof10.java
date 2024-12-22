package Dec_2024.WhileLoop;

import java.util.Scanner;

public class Lab017Factof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. will tell you the factorial value");
        long n =sc.nextInt();

        long fact = 1;
        for (long i = 1; i <=n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
