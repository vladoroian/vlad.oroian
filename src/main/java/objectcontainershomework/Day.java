package objectcontainershomework;

public enum Day {
    MON("Monday"),
    Tue("Tuesday"),
    Wed("Wednesday"),
    Thu("Thursday"),
    Fry("Friday"),
    Sat("Saturday"),
    Sun("Sunday");

    private final String name;

    Day(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
