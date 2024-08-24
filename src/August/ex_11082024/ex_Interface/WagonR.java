package August.ex_11082024.ex_Interface;

public class WagonR implements Engine{
    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    public void startEngine() {
        System.out.println("Starting the engine!!");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine !!");

    }
}
