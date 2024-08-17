package August.ex_04082024;

import java.util.Scanner;

public class Lab170 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        /*System.out.println(b1.bankName);
        System.out.println(b1.bankCode);
        System.out.println(b1.balance);

        BankAccount bicici = new BankAccount("ICICI",1000,"ICICI001");
        System.out.println(bicici.bankName);
        System.out.println(bicici.bankCode);
        System.out.println(bicici.balance);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank cODE!");

        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, bal, bCode);


        baicici.printDetails();

        sc.close();



    }

}
