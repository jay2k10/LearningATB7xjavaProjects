package Jan2025.encapsulation;

public class IciciBank {

    private String name;
    private int bal;

    public IciciBank(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal , boolean isAdmin) {
        if(isAdmin){
        this.bal = bal;
            System.out.println("Allowed");
        }else {
            System.out.println("not allowed");
        }
    }
}
