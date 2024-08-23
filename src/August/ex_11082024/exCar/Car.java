package August.ex_11082024.exCar;

  class Car extends Engine {
    //Engine
    //GearBox
    //Keys

    //Tesla is a car
    //Tesla - DRIVE()

    @Override
    void openCar() {
        System.out.println("Open the car with keys");
    }

    @Override
    void partofGearBox() {
        System.out.println("Part of gear box");

    }

    @Override
    void stop() {
        System.out.println("Stop the car");

    }

      @Override
      void speed() {
          System.out.println("Speed of car");
      }

      @Override
    void start() {
        System.out.println("Start the car");

    }
}
