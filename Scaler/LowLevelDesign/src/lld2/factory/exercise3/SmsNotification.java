
public class SmsNotification extends Notification {
    private String recipient;
    private String message;

    public SmsNotification(String recipient,  String message) {
        super(recipient, message);
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public void sendNotification() {
        // Logic to send an SMS
        System.out.println("SMS sent to " + recipient);
        System.out.println("Message: " + message);
    }

    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}