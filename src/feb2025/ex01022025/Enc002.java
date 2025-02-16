package feb2025.ex01022025;

public class Enc002 {
    public static void main(String[] args) {
        HDOR1 hdor1 = new HDOR1("admin", "Password@1234");
        System.out.println(hdor1.getPassword());
        hdor1.setPassword("P@ssword",false);
        System.out.println(hdor1.getPassword());

    }

}

class HDOR1 {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAuth) {
        if(isAuth){
        this.password = password;
    }else {
            System.out.println("Not authenticate to update the password!!");
        }
    }

    public HDOR1(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

}
