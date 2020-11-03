package javaoophomework.firstimplementation;

public class Main {

    public static void main (String...args) {

        System.out.println("SamsungGalaxys6");
        Phone phone = new SamsungGalaxyS6 ("Serial no. 1", "blue","plastic");
        System.out.println("ADD & LIST CONTACTS....................");
        phone.addContact(1, "0748123123", "Vasile", "Pop");
        phone.addContact(2, "0745098645", "Marian", "Cristoiu");
        phone.listContacts();
        System.out.println("                          ");

        phone.sendMessage("0748123123", "First message");
        phone.sendMessage("0748123123", "Second message");
        phone.sendMessage("0748123123", "Third message");
        phone.sendMessage("0748123123", "Last messageaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttaaaaaa");
        phone.listMessages();
        System.out.println("                          ");

        phone.makeCall("0745098645");
        phone.listCallHistory();

        System.out.println("                        ");
        System.out.println("SamsungGalaxyNote");
        Phone phone2 = new SamsungGalaxyNote ("Serial no. 2", "red","plastic");
        System.out.println("ADD & LIST CONTACTS....................");
        phone2.addContact(1, "0748123123", "Vasile", "Pop");
        phone2.addContact(2, "0745098645", "Marian", "Cristoiu");
        phone2.listContacts();
        System.out.println("                          ");

        phone2.sendMessage("0748123123", "First message");
        phone2.sendMessage("0748123123", "Second message");
        phone2.sendMessage("0748123123", "Third message");
        phone2.listMessages();
        System.out.println("                          ");

        phone2.makeCall("0745098645");
        phone2.listCallHistory();

        System.out.println("                        ");
        System.out.println("Iphone11");
        Phone phone3 = new Iphone11 ("Serial no. 3", "dark grey","plastic");
        System.out.println("ADD & LIST CONTACTS....................");
        phone3.addContact(1, "0748123123", "Vasile", "Pop");
        phone3.addContact(2, "0745098645", "Marian", "Cristoiu");
        phone3.listContacts();
        System.out.println("                          ");

        phone3.sendMessage("0748123123", "First message");
        phone3.sendMessage("0748123123", "Second message");
        phone3.sendMessage("0748123123", "Third message");
        phone3.listMessages();
        System.out.println("                          ");

        phone3.makeCall("0745098645");
        phone3.listCallHistory();

        System.out.println("                        ");
        System.out.println("Iphone11");
        Phone phone4 = new Iphone12 ("Serial no. 4", "dark grey","plastic");
        System.out.println("ADD & LIST CONTACTS....................");
        phone4.addContact(1, "0748123123", "Vasile", "Pop");
        phone4.addContact(2, "0745098645", "Marian", "Cristoiu");
        phone4.listContacts();
        System.out.println("                          ");

        phone4.sendMessage("0748123123", "First message");
        phone4.sendMessage("0748123123", "Second message");
        phone4.sendMessage("0748123123", "Third message");
        phone4.listMessages();
        System.out.println("                          ");

        phone4.makeCall("0745098645");
        phone4.listCallHistory();
    }

}
