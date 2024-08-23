package August.ex_11082024.exLoan;

public class Lab188 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();
        //s1.loan25k();

        //Dynamic dispatch
        Father f1 = new Son();
        f1.loan25k();
        f1.loan50K();

    }
}
