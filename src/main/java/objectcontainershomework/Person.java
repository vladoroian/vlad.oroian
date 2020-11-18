package objectcontainershomework;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    List<Hobby> hobbyList = new ArrayList<Hobby>();

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {

        return "Name is " + this.name + ", age is " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(hobbyList, person.hobbyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hobbyList);
    }
}



