
public abstract class Notification {

    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public abstract NotificationType notificationType();
    public abstract String getRecipient();
    public abstract String getMessage();
    public abstract void sendNotification();

}