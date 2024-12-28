package Dec_2024.ex_25122024.abstr.exCar;

public class I10 extends Engine{
    void drive(){
        openCar();
        partofGearBox();
        start();
        stop();
        speed();
    }

    @Override
    void start() {
        System.out.println("I10 start");

    }

    @Override
    void stop() {
        System.out.println("i10 stop");

    }

    @Override
    void speed() {
        System.out.println("i10 speed");

    }

    @Override
    void partofGearBox() {
        System.out.println("i10 gearbox");

    }

    @Override
    void openCar() {
        System.out.println("Open i10 car");

    }
}
