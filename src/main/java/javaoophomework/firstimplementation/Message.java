package javaoophomework.firstimplementation;

public class Message {
    private String phoneNumber;
    private String message;

    public Message (String phoneNumber, String message) {

        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String toString () {

        return message;
    }
}
