package Dec_2024;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        if(num>0){
            System.out.println("Number is positive");
        }else if (num<0){
            System.out.println("Number is -ve ");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
