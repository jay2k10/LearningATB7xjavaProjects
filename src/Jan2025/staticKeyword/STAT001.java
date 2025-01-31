package Jan2025.staticKeyword;

public class STAT001 {
    public static void main(String[] args) {
        ATB A1 = new ATB("Amit");
        System.out.println(A1.getName());
        System.out.println(ATB.courseName);
        ATB.doAssignment();
        ATB.paidFee();

    }
    }
    class ATB{
        private String name;
        static  String courseName="ATB7x";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ATB(String name) {
            this.name = name;
        }
        static void doAssignment(){
            System.out.println("Do Assignment");
        }
        static void paidFee(){
            System.out.println("Pay Fee");

        }
    }

