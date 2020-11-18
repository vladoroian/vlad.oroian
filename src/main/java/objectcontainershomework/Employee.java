package objectcontainershomework;

public class Employee extends Person {

    private String employmetStatus;

    public Employee(String name, int age, String employmetStatus) {
        super(name, age);
        this.employmetStatus = employmetStatus;

    }
}
