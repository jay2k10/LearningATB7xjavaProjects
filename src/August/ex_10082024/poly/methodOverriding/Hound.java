package August.ex_10082024.poly.methodOverriding;

public class Hound extends Dog{
    /*public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
    }*/
    @Override
    void bark(){
        System.out.println("You are Hound you bark!");
    }


}
