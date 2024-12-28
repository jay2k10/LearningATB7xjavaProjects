package Dec_2024.wrapperClasses;

public enum APIurl {
    BASE_URL("https://app.VWO.com"),
    LOGIN_PAGE("https://app.VWO.com/login"),
    DASHBOARD("https://app.VWO.com/dashboard");



    private final String name;
    APIurl(String name ) {
        this.name=name;
    }
    public String getValue(){
        return name;
    }
}

