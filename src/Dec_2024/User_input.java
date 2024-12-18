package Dec_2024;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int user_input =sc.nextInt();
        System.out.println(user_input);
        if (user_input%2 ==0){
            System.out.println("this is even");
        }
        else{
            System.out.println("number is odd");
        }

    }
}
