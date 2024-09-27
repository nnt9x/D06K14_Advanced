package buoi7.dip;

public class EmailNotificationSystem implements NotificationSystem {

    @Override
    public void broadcastMessage(String content) {
        System.out.println("Email: " + content);
    }
}
