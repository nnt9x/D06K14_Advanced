package singleton;

public class Main {
    public static void main(String[] args) {
        // Để private không cho phép tạo dùng new
        // Printer printer = new Printer();

        Printer printer1 = Printer.getInstance();
        printer1.print("Hello world");

        Printer printer2 = Printer.getInstance();
        printer2.print("How are you?");

        System.out.println(printer1.hashCode());
        System.out.println(printer2.hashCode());

        ConnectDB connectDB = ConnectDB.getInstance();


    }
}
