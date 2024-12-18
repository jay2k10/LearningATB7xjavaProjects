package Dec_2024;

import java.util.Scanner;

public class Grade_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = sc.nextInt();
        char grade = 'f';
        if (score>=90 && score<=100){
            grade= 'A';
        } else if (score<=80 && score>=70) {
            grade= 'B';

        }else{
            grade = 'f';
        }
        System.out.println("grade is "+grade);
        sc.close();
    }
}