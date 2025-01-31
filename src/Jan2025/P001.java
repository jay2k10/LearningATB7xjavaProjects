package Jan2025;

public class P001 {
    String name;
    int rollNo;

    void talk() {
        System.out.println("Talk");
    }

    void dance() {
        System.out.println("Dance");
    }

    public static void main(String[] args) {
        P001 p = new P001();
        p.name = "jay";
        p.rollNo = 001;
        p.dance();
        p.talk();

    }
}
