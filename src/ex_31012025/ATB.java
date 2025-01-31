package ex_31012025;

public class ATB {
    String name;
    int phone;

    // Default Constructor
    ATB(){
        System.out.println("Object is created!!");
    }

    //Parameterised Constructor
    ATB(String givenName, int givenPhone){
        this.name=givenName;
        this.phone=givenPhone;

    }
}
