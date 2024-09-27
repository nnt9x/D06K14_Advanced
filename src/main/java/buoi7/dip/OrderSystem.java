package buoi7.dip;

public class OrderSystem {

    private NotificationSystem notificationSystem;

    public NotificationSystem getNotificationSystem() {
        return notificationSystem;
    }

    public void setNotificationSystem(NotificationSystem notificationSystem) {
        this.notificationSystem = notificationSystem;
    }

    public void handleOrder(){
        // Logic xu ly hoa don
        // Dua ra thong bao: Phone, Email, Zalo, Telegram...
        System.out.println("Xử lý hoá đơn, gửi thông báo");
        notificationSystem.broadcastMessage("Thành công");
    }
}
