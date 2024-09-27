package buoi7.dip;

public class Main {
    public static void main(String[] args) {
        // Lua chon thong bao
        NotificationSystem emailNotification = new EmailNotificationSystem();
        NotificationSystem zaloNotification = new ZaloSystemNotification();

        // Order
        OrderSystem orderSystem = new OrderSystem();
        // Don 1: chon gui qua email
        orderSystem.setNotificationSystem(emailNotification);
        orderSystem.handleOrder();

        // Don 2: chon gui qua zalo
        orderSystem.setNotificationSystem(zaloNotification);
        orderSystem.handleOrder();

        // Don3: facebook
        NotificationSystem facebookNotification = new FacebookNotification();
        orderSystem.setNotificationSystem(facebookNotification);
        orderSystem.handleOrder();

    }
}
