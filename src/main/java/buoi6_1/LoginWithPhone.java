package buoi6_1;

public class LoginWithPhone implements Login{
    private String phone;
    private String password;

    public LoginWithPhone(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }


    @Override
    public boolean login() {
        // Xu ly login
        return false;
    }
}
