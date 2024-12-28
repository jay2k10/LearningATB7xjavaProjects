package Dec_2024.ex_exceptionalHandling26122024;

public class RunnerBank {
    public static void main(String[] args) throws Exception {
        //throw
        //custom exception
        Bank sbi = new Bank("INR", 100);
       /* Bank icici = new Bank("INR", 10);
        Integer total = sbi.add(icici);*/

        Bank jpmorgan = new Bank("USD", 89);
        Integer total = sbi.add(jpmorgan);
        System.out.println(total);
    }
}
