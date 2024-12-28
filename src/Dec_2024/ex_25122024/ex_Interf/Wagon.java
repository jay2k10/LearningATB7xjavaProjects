package Dec_2024.ex_25122024.ex_Interf;

public class Wagon implements Engine{

    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");

    }
}
