package Dec_2024.ex_25122024.multipleinhr;

public class Son implements Father,Mother {

    @Override
    public void money() {
        System.out.println("This is only one function");
    }

    @Override
    public void home() {
        System.out.println("This is my HOME");

    }
}
