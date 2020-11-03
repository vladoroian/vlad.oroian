package javaoophomework.firstimplementation;

import java.util.ArrayList;

public abstract class Iphone implements Phone {
    private String color;
    private String material;

    public  ArrayList<Contact> contacts;
    public  ArrayList<Message> messages;
    public  ArrayList<Call> historyCalls;

    int messagesSize;
    int batteryRemaining;
    int callSize;

    public Iphone (String color, String material) {
        this.color = color;
        this.material = material;
        this.contacts = new ArrayList<Contact>();
        messages = new ArrayList<Message>();
        historyCalls = new ArrayList<Call>();
    }

    public Iphone () {
        contacts = new ArrayList<Contact>();
        messages = new ArrayList<Message>();
        historyCalls = new ArrayList<Call>();
    }

    public Iphone (int messagesSize, int batteryRemaining, int callSize) {
        this.messagesSize = messagesSize;
        this.batteryRemaining = batteryRemaining;
        this.callSize = callSize;
    }

    @Override
    public void addContact(int no, String phoneNumber, String firstName, String lastName) {
        Contact newContact = new Contact(no, phoneNumber, firstName, lastName);
        contacts.add(newContact);
    }

    @Override
    public void listContacts() {
        for (Contact c : contacts){
            System.out.println (c.toString());
        }
    }

    @Override
    public void listMessages() {
        for (Message m : messages) {
            System.out.println (m.toString());
        }
    }

    @Override
    public void listCallHistory() {
        for (Call ch : historyCalls) {
            System.out.println(ch.toString());
        }
    }
}
