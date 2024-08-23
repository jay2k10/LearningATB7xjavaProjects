package August.ex_11082024.exCar;

public class Teslat1 extends Engine{

    void drive(){
        openCar();
        partofGearBox();
        speed();
        start();
        stop();
    }


    @Override
    void start() {
        System.out.println("Tesla Start");

    }

    @Override
    void stop() {
        System.out.println("Tesla Stop");

    }

    @Override
    void speed() {
        System.out.println("Speed of tesla 500KM/H");

    }

    @Override
    void partofGearBox() {
        System.out.println("Tesla Gearbox");

    }

    @Override
    void openCar() {
        System.out.println("Open Tesla");

    }
}
