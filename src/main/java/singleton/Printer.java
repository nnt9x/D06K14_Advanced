package singleton;

public class Printer {
    // đối tượng -> thao tác với máy in thực tế
    private static Printer instance = null;

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }


    private Printer() {
    }

    public void print(String content) {
        // Logic in ra ...
        // Mo phong in ra console
        System.out.println(content);
    }

    public void stop() {
        System.out.println("Dừng in");
    }
}
