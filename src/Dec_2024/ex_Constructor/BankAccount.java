package Dec_2024.ex_Constructor;

public class BankAccount {
    String name;
    int balance;
    String bankCode;

    //DC
    BankAccount() {
        name = "SBI";
        balance = 100;
        bankCode = "SBI001";
    }

    //PC
    BankAccount(String name, int balance, String bankCode) {
        this.name = name;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    void printDetails() {
        System.out.println("Name of the bank is :" + name);
        System.out.println("Bank balance is :" + balance);
        System.out.println("BankCode is :" + bankCode);
    }
}
