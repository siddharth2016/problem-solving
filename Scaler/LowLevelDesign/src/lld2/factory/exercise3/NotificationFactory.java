
public class NotificationFactory {

    public static Notification createNotification(NotificationType type, String recipient, String message, String sender) {
        switch(type) {
            case EMAIL: return new EmailNotification(recipient, sender, message);
            case PUSH: return new PushNotification(recipient, message);
            case SMS: return new SmsNotification(recipient, message);
            default: return null;
        }
    }

}