package Dec_2024.ex_Constructor;

public class BankCons {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        //System.out.println("with Default constructor use: "+b1.balance);
        //System.out.println("with Default constructor use: "+b1.name);
        //System.out.println("with Default constructor use: "+b1.bankCode);

        BankAccount b2 = new BankAccount("icici",100,"ICICI002");
        //System.out.println("with parameterised constructor use: "+b2.balance);
        //System.out.println("with parameterised constructor use: "+b2.name);
        //System.out.println("with parameterised constructor use: "+b2.bankCode);
        b1.printDetails();
        System.out.println("-----------------------------");
        b2.printDetails();
    }
}
