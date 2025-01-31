package Jan2025.poly.overriding;

public class OR001 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();

        Hound h1 = new Hound();
        h1.bark();

        Dog dh = new Hound();
        dh.bark();

    }
}
