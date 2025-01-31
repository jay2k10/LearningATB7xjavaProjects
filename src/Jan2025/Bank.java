package Jan2025;

public class Bank {
    String bankName;
    int balance;
    String bankCode;

    Bank() {
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    Bank(String bname, int bal, String bCode) {
        this.bankName = bname;
        this.balance = 100;
        this.bankCode = bCode;

    }

    void printBalance() {
        System.out.println("Bank Name is :" + bankName);
        System.out.println("Bamnk balance is :" + balance);
        System.out.println("Bank code is :" + bankName);
    }
}
