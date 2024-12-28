package Dec_2024.staticKey;

public class Lab2k24 {
    public static void main(String[] args) {
        ATB a1 = new ATB("jay");
        System.out.println("1st student name:" + a1.getName());
        System.out.println("Course name is :" + ATB.courseName);

        ATB a2 = new ATB("Shankar");
        System.out.println("2nd student name:" + a2.getName());

    }

}

class ATB {
    private String name;
    static String courseName = "ATB7X";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }
}
