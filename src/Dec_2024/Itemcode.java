package Dec_2024;

public class Itemcode {
    public static void main(String[] args) {
        int item_code = 001;
        switch (item_code){
            /*case 001,002,003:
                System.out.println("electronics gadgets");
                break;
            case 004,005,006:
                System.out.println("Mechanical gadgets");
                break;
            default:
                System.out.println("none");*/
            case 001 -> System.out.println("Electronics Gadgets");
            case 002,003,004 -> System.out.println("Mechanical gadgets");
            default -> System.out.println("None");
        }
    }
}
