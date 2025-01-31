package Jan2025.inter;

public interface E {
    void startEngine();
    void stopEngine();

    default void haltEngineStart(){
        System.out.println("Halt the engine - Start");
    }
    default void haltEngineStop(){
        System.out.println("Halt the engine - Stop");

    }
    static void m1(){
        System.out.println("M1");
    }
    void m2();
    void m3();
//    void m4(){
//        System.out.println("M4"); // complete method is not possible in interface it is only possible with static or default keyword.
//    }
}
