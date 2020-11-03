package javaoophomework.secondimplementation;

import java.util.ArrayList;

public class Phone implements UserService {

    private final int BATERRY_LIFE = 10000;
    private String color;
    private String material;
    private String name;
    Contact contact;
    Message message;

    public ArrayList<Contact> contacts = new ArrayList<Contact>();
    public ArrayList<Message> messages = new ArrayList<Message>();
    public ArrayList<Call> historyCalls = new ArrayList<Call>();

    public int batteryRemaining;
    public int messagesSize;
    public int callSize;


    public Phone (String name, String color, String material) {

        this.name = name;
        this.color = color;
        this.material = material;

    }

    @Override
    public void addContact (int no, String phoneNumber, String firstName, String lastName) {
        //Contact thirdContact = new Contact (no, phoneNumber, firstName, lastName);
        contacts.add(new Contact (no, phoneNumber, firstName, lastName));
    }


    public void addContact2(Contact contact) {
        contacts.add(contact);
    }


    @Override
    public  void listContacts() {
        for (Contact c : contacts){
            System.out.println (c.toString());
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        if (message.length() >500 ) {
            System.out.println ("Message sent is too long. Max characters allowed is 500 chars");
        } else {
            Message thirdMessage = new Message(phoneNumber, message);
            messages.add(thirdMessage);
            messagesSize = messages.size();
            batteryRemaining = BATERRY_LIFE - messagesSize;
            System.out.println("Remaining battery is " + batteryRemaining);
        }
    }


    public void sendMessage2 (Message message) {
        messages.add(message);
    }

    @Override
    public void listMessages() {

        for (Message m : messages) {
            System.out.println (m.toString());
        }
    }

    @Override
    public void makeCall(String phoneNumber) {
        Call newcall = new Call (phoneNumber);
        historyCalls.add(newcall);
        callSize = 2 *  historyCalls.size();
        batteryRemaining = BATERRY_LIFE - callSize - messagesSize;
        System.out.println("Remaining battery is " + batteryRemaining);
    }


    public void makeCall2 (Call call) {
        historyCalls.add(call);
    }

    @Override
    public void listCallHistory() {
        for (Call ch : historyCalls) {
            System.out.println(ch.toString());
        }
    }

    @Override
    public String toString () {

        return "Phone name is " + name + ", color is " + color + ", material is " + material;
    }


}