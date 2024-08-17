package August.ex_10082024.poly.methodOverriding;

public class Lab182 {
    //overriding
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_ref = new Hound();
        dog_ref.bark();
    }
}
