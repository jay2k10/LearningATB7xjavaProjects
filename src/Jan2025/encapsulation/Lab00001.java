package Jan2025.encapsulation;

public class Lab00001 {
    public static void main(String[] args) {
        IciciBank iciciBank = new IciciBank("jay",100);
        System.out.println(iciciBank.getName());
        iciciBank.setName("Shankar");
        System.out.println(iciciBank.getName());
        System.out.println(iciciBank.getBal());
        iciciBank.setBal(10000,true);
        System.out.println(iciciBank.getBal());



    }
}
