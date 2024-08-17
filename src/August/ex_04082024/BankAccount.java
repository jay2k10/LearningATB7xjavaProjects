package August.ex_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;
     //DC
     BankAccount() {
        bankName="SBI";
        bankCode="SBO001";
        balance=1000;
    }
    //PC
     BankAccount(String name, int bal, String bCode){
       this.bankName=name;
       this.balance=bal;
       this.bankCode=bCode;
    }


    void printDetails(){
        System.out.println("Bank Name is "+bankName);
        System.out.println("Bank Code is "+bankCode);
        System.out.println("My balance is "+balance);

    }

}
