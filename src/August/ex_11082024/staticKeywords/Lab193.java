package August.ex_11082024.staticKeywords;

public class Lab193 {
    //static
    //block
    //data member
    //function
    //class

    public static void main(String[] args) {
        ATB a1 = new ATB("Amit");
        System.out.println(a1.getName());
        System.out.println(ATB.courseName);
        ATB a2 = new ATB("Priyanka");
        System.out.println(a2.getName());
        ATB.doassigment();

    }
}
class ATB {

    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a webite or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }

    private String name;
    private String phoneno;
    static String courseName= "ATB7x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }
    static void doassigment(){
        System.out.println("All do assigment");
    }
    static class A{

    }
}
