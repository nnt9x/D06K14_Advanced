package buoi7.dip;

public class FacebookNotification implements NotificationSystem {
    @Override
    public void broadcastMessage(String content) {
        System.out.println("FB: " + content);
    }
}
