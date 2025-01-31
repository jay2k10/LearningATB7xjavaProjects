package ex_31012025;

public class BankRunner {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.printDetails();
        Bank b2 = new Bank("ICICI",100,"ICIC000888");
        b2.printDetails();
    }
}
