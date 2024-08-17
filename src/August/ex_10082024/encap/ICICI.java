package August.ex_10082024.encap;

public class ICICI {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.
    private String name;
    private long bal;

    public ICICI(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean IsAdmin) {
        if(IsAdmin) {
            this.name = name;
            System.out.println("Allowed!");
        }else{
            System.out.println("Not Allowed!");
        }
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean IsAdmin) {
        if(IsAdmin) {
            this.bal = bal;
            System.out.println("Allowed!");
        }else {
            System.out.println("Not Allowed!");
        }
    }
}
