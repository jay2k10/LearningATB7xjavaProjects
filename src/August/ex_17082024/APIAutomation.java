package August.ex_17082024;

public class APIAutomation {
    public static void main(String[] args) {
        APIAutomation a = new APIAutomation();

        //SIB - call 1 time
        //IIB - call when objects are created
    }

    static {
        System.out.println("Loaded data from MYSQL");
    }

    {
        System.out.println("Loaded data from CSV");
    }
}