import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int user_Input = sc.nextInt();

        if (user_Input>90 && user_Input<=100){
            System.out.println("Grade is A");
        }
        else if(user_Input>80 && user_Input<=89){
            System.out.println("Grade is B");
        }
        else{
            System.out.println("Fail");
        }
    }
}
