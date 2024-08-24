package August.ex_11082024.ex_Interface.multipleinheritance;

public class Son implements Father,Mother{
    @Override
    public void money() {
        System.out.println("This is only one function");

    }

    @Override
    public void home() {
        System.out.println("My Sweet Home");

    }
}
