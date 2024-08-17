package August.ex_04082024.multilevelinheritance;

public class Lab174 {
    public static void main(String[] args) {
        // Multi Level
        // GF -> F -> Child
        Child c = new Child();
        c.home();  // If name is same C -> F -> GF
        c.f();
        c.home();
        c.gf();
        c.extra();
        c.c();
    }
}
