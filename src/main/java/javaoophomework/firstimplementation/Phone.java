package javaoophomework.firstimplementation;

public interface Phone {

    void addContact (int no, String phoneNumber, String firstName, String lastName);

    void  listContacts();

    void sendMessage (String phoneNumber, String message);

    void listMessages ();

    void makeCall (String phoneNumber);

    void listCallHistory ();

}
