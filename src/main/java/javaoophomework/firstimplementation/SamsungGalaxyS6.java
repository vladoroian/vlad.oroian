package javaoophomework.firstimplementation;

public class SamsungGalaxyS6 extends Samsung {

    private final int BATERRY_LIFE = 12;
    private String name;

    public SamsungGalaxyS6 (String name, String color, String material) {

        super(color, material);
        this.name=name;
    }

    public SamsungGalaxyS6 (int messagesSize, int batteryRemaining, int callSize){
        super(messagesSize, batteryRemaining, callSize);
    }


    @Override
    public void sendMessage(String phoneNumber, String message) {
        if (message.length() >500 ) {
            System.out.println ("Message sent is too long. Max characters allowed is 500 chars");
        } else {
            Message newMessage = new Message(phoneNumber, message);
            messages.add(newMessage);
            messagesSize = messages.size();
            batteryRemaining = BATERRY_LIFE - messagesSize;
            System.out.println("Remaining battery is " + batteryRemaining);
        }
    }

    @Override
    public void makeCall(String phoneNumber) {
        Call newcall = new Call(phoneNumber);
        historyCalls.add(newcall);
        callSize = 2 *  historyCalls.size();
        batteryRemaining = BATERRY_LIFE - callSize - messagesSize;
        System.out.println("Remaining battery is " + batteryRemaining);
    }

}
