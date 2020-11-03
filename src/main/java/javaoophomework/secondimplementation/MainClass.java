package javaoophomework.secondimplementation;

public class MainClass {

    public static void main (String...args) {
        Phone phone01 = new Phone ("x", "Dark grey", "Plastic" );
/*        Contact firstContact = new Contact (1,"0748123123", "Vasile", "Pop");
        Contact secondContact = new Contact (2,"0745098645", "Marian", "Cristoiu");
        Message firstMessage = new Message ("0748123123", "This is message no. 1" );
        Message secondMessage = new Message ("0743123432", "random message");
        Call firstCall = new Call ("0745098645");*/
        //System.out.println (phone01);
        // System.out.println (firstContact);
/*        phone01.addContact2(firstContact);
        phone01.addContact2(secondContact);*/

        System.out.println("ADD & LIST CONTACTS....................");
        phone01.addContact(44, "0748123123", "Vasile", "Pop");
        phone01.addContact(45, "0748123123", "Vasile", "Pop");
        phone01.listContacts();
        System.out.println("                          ");

        System.out.println("ADD & LIST MESSAGES....................");
/*        phone01.sendMessage2(firstMessage);
        phone01.sendMessage2(secondMessage);*/
        phone01.sendMessage("0748123123", "This is message no.1");
        phone01.sendMessage("0743123432", "This is message no.2");
        phone01.sendMessage("0745364875", "This is message no.3");
        phone01.listMessages();
        System.out.println("                          ");

        System.out.println("ADD & LIST PHONE CALLS....................");
/*        phone01.makeCall2(firstCall);*/
        phone01.makeCall("0745098645");
        phone01.listCallHistory();

/*        Samsung firstSamsung = new Samsung ("21", "21", "3452");
        Samsung secondSamsung = new Samsung ("21", "21", "3452");
        System.out.println(firstSamsung.getNameStatic() + "//" + secondSamsung.getNameStatic());
        secondSamsung.setNameStatic("abc");
        System.out.println(firstSamsung.getNameStatic() + "//" + secondSamsung.getNameStatic());
        System.out.println("....................");
        phone01.addContact(44, "0748123123", "Vasile", "Pop");
        phone01.addContact(45, "0748123123", "Vasile", "Pop");
        phone01.listContacts();*/
    }
}
