package buoi6_1;

public class Main {
    public static void main(String[] args) {
//        Login login = new DefaultLogin("abc@gmail.com","as33");
//        if(login.login()){
//            System.out.println("Thanh cong");
//        }

        Login login = new LoginWithPhone("222872","882828");
        if(login.login()){
            System.out.println("Thanh cong");
        }


    }
}
