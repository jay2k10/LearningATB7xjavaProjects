package August.ex_10082024.encap;

public class Lab180 {
    public static void main(String[] args) {
        ICICI jay = new ICICI("Jay", 1000);
        System.out.println(jay.getName());
        System.out.println(jay.getBal());
        jay.setBal(50000,false);
        System.out.println(jay.getName());
        System.out.println(jay.getBal());

        ICICI admin= new ICICI("naman", 10000);
        admin.setBal(50000,true);
        System.out.println(admin.getName());
        System.out.println(admin.getBal());
    }
}
