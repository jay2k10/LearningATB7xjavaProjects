package Dec_2024.ex_accessModifiers.police;

public class Shankar {
    private String name;
    private int id;
    // instance should be well protected

    protected void talk(){
        // only class for the same package can see us
    }
}
