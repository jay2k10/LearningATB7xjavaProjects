package ex_31012025;

public class Tejaswini {
    String name ="Pranavi";
    int height;
    int noOfPen;

    void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Tejaswini t = new Tejaswini();
        //t.name = "Pranavi";
        t.height = 5;
        t.noOfPen = 5;
        t.run();
        System.out.println(t.name);

        Tejaswini t1 = new Tejaswini();
        Tejaswini t3 = t;
        Tejaswini t4 = t3;
    }
}
