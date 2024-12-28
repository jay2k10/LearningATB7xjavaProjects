package Dec_2024.ex_encapsulation;

//Encapsulation
public class Ecap {
    public static void main(String[] args) {
        VWOLogin jay = new VWOLogin("jay", "jay@1234");
        //System.out.println(vwoLogin.getPassword());
        jay.setPassword("jay@123456",false);
        //System.out.println(vwoLogin.getPassword());
        //System.out.println(vwoLogin.getUsername());
    }


}

class VWOLogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
            this.password = password;
        }else{
            System.out.println("Not Allowed");
        }
        this.password = password;
    }

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}



