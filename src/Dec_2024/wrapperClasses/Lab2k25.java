package Dec_2024.wrapperClasses;

public class Lab2k25 {
    public static void main(String[] args) {
        APIAutomation apiAutomation = new APIAutomation();
    }
}

class APIAutomation {
    static {
        System.out.println("Loaded data from MYSQL!!");
    }

    {
        System.out.println("Loaded data from CSV file!!");
    }
}
