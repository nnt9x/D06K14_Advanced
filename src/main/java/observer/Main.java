package observer;

public class Main {
    public static void main(String[] args) {
        // Tao 3 nguoi nhan vien, 1 admin
        User e1 = new User("e1", "Employee 1", "e1@gmail.com", 1);
        User e2 = new User("e2", "Employee 2", "e2@gmail.com", 1);
        User e3 = new User("e3", "Employee 3", "e3@gmail.com", 1);
        User admin = new User("admin", "Admin", "admin@gmail.com", 0);

        // 2 khach hang
        User c1 = new User("c1", "Customer 1", "c1@gmail.com", 2);
        User c2 = new User("c2", "Customer 2", "c2@gmail.com", 2);

        // Tao he thong thong bao
        Publisher eventManager = new EventManager();
        // Dang ki nhan don moi
        eventManager.subscribe("NEW_ORDER", admin);
        eventManager.subscribe("NEW_ORDER", e1);
        eventManager.subscribe("NEW_ORDER", e2);
        eventManager.subscribe("NEW_ORDER", e3);

        // Khach hang 1 va 2 dat chung 1 don
        String order = "groupOrder";
        eventManager.subscribe(order, c1);
        eventManager.subscribe(order, c2);

        // Thong bao don moi de xu lys
        eventManager.notify("NEW_ORDER",order);
        // Xu ly order va thong bao den khach
        eventManager.notify(order, "Xử lý thành công");
        // huy lang nghe su kien
        eventManager.removeEvent(order);

        eventManager.notify(order, "Xử lý thành công");


    }
}
