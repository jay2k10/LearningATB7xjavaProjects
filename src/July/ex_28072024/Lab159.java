package July.ex_28072024;

public class Lab159 {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        Bank b3 = new Bank();
        b1.bankName="ICIC";
        b2.bankName="SBI";
        b1.balance="10K";
        b2.balance="20K";
        System.out.println("First bank name is  " + b1.bankName);
        System.out.println("Second bank name is  " + b2.bankName);
        System.out.println("First bank balance is  " + b1.balance);
        System.out.println("Second bank balance is  " + b2.balance);

        System.out.println("Third bank name is  " + b3.bankName);
        System.out.println("Third bank balance is  " + b3.balance);

    }
}
