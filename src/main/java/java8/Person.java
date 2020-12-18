package java8;


import lombok.ToString;

@ToString
public class Person {

    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {

        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {

        return this.name;
    }

    public int getAge() {

        return this.age;
    }
}
