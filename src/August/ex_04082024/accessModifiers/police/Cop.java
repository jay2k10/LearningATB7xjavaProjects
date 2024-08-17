package August.ex_04082024.accessModifiers.police;

public class Cop {
    //public int gun;
   //public String idCard;
    private int gun;
    private String idCard;
   public Cop(int gun){
        this.gun=gun;
    }
    protected void canIShoot(){
        System.out.println("Yes yoy can !");
    }
}
