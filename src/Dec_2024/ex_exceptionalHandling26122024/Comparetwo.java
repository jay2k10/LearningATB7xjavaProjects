package Dec_2024.ex_exceptionalHandling26122024;

import java.util.Scanner;

public class Comparetwo {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first name");
        String name1 = sc1.next();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter second name");
        String name2 = sc2.next();

        if (name1.equalsIgnoreCase(name2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }


    }
}
