package July.ex_21072024;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(i%3 ==0 && i%5 ==0){
                System.out.println("FizzBuzz");
            } else if (i%3 ==0) {
                System.out.println("Fizz");
            } else if (i%5 ==0) {
                System.out.println("Buzz");

            }
            else {
                System.out.println(i);
            }

        }
    }
}
