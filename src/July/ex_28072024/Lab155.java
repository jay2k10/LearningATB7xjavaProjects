package July.ex_28072024;

public class Lab155 {
    public static void main(String[] args) {

        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using


        BuildingBP dlf = new BuildingBP();
        dlf.name="DLF private ltd.";
        dlf.color="Blue";
        dlf.noofRooms=100;
        System.out.println(dlf.color);
        System.out.println(dlf.name);


        dlf.useLift();
        dlf.activities();

        BuildingBP prestige = new BuildingBP();
        prestige.name="Prestige private ltd";
        System.out.println(prestige.name);


    }
}
