package buoi7.dip;

public class ZaloSystemNotification implements NotificationSystem {
    @Override
    public void broadcastMessage(String content) {
        System.out.println("Zalo: " + content);
    }
}
