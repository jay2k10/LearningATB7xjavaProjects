package feb2025.ex01022025;

public class Vehicle {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.display();
    }
}

class Bus extends Vehicle1 {
    int maxspeed = 200;
   Bus(){
       super();
       System.out.println("Child Constructor");
   }
    void display() {
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);
        this.message();
        super.message();
    }

    @Override
    void message() {
        System.out.println("subclass message");
    }
}

class Vehicle1 {
    int maxspeed = 180;
   Vehicle1(){
       System.out.println("Parent constructor");
   }
    void message() {
        System.out.println("Parent Message");
    }

    void message(int a) {
        System.out.println("Hello");
    }
}
