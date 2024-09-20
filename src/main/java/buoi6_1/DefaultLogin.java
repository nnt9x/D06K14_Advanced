package buoi6_1;

public class DefaultLogin implements Login {
    private String email;
    private String password;

    public DefaultLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean login() {
        // Dung email, password tren, dua quyet dinh
        return false;
    }
}
