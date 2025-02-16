package feb2025.ex01022025;

public class Enc001 {
    public static void main(String[] args) {
        HDOR hdor = new HDOR("jay","P@ssword");
        System.out.println(hdor.password);
        hdor.password="Password@1234";
        System.out.println(hdor.password);
    }


}
class HDOR{
    String username;
    String password;

    public HDOR(String userName,String password){
        this.username=userName;
        this.password=password;

    }
}
