package Dec_2024.ex_exceptionalHandling26122024;

import java.util.Scanner;

public class Lab00007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a == 0) {
            throw new ArithmeticException("Enter non zero number");
        }
        int x = 10 / a;
        System.out.println(x);
    }
}
