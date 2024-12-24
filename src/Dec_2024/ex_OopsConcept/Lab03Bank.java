package Dec_2024.ex_OopsConcept;

public class Lab03Bank {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        b1.name= "SBI";
        b2.name = "ICICI";

        System.out.println(b1.name);
        System.out.println(b2.name);
        System.out.println(b1.balance);

        b1.balance=100;
        System.out.println(b1.balance);
    }
}
