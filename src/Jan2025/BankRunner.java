package Jan2025;

public class BankRunner {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.bankName);
        System.out.println(b.balance);
        System.out.println(b.bankCode);

        Bank b1 = new Bank("SBISAHAR",100,"SBI009");
        System.out.println(b1.bankName);
        System.out.println(b1.balance);
        System.out.println(b1.bankCode);
    }
}
