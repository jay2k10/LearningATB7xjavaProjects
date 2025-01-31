package ex_31012025;

public class Bank {
    String bankName;
    int balance;
    String bankCode;
      Bank(){
          bankName="SBI";
          balance=100;
          bankCode="SBI001";
      }
      Bank(String bName,int bal,String bCode){
          this.bankName=bName;
          this.balance=bal;
          this.bankCode=bCode;
      }

    void printDetails(){
        System.out.println("Bank Name is : "+bankName);
        System.out.println("Balance is :"+balance);
        System.out.println("BankCode is :"+bankCode);
    }

}
