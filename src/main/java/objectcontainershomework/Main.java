package objectcontainershomework;

import java.util.*;

public class Main {

    public static void main(String... args) {


//Requirement no. 1

        System.out.println("Requirement no. 1");
        Set<Person> nameComp = new TreeSet<>(Comparator.comparing(Person::getName)); //order alphabetical
        Set<Person> ageComp = new TreeSet<>(Comparator.comparing(Person::getAge)); //order ascending

        Person firstPeople = new Person("Vlad", 30);
        Person secondPeople = new Person("Ana", 40);
        Person thirdPeople = new Person("Maria", 25);

        nameComp.add(firstPeople);
        nameComp.add(secondPeople);
        nameComp.add(thirdPeople);

        for (Person person : nameComp) {

            System.out.println(nameComp);

        }

        ageComp.add(firstPeople);
        ageComp.add(secondPeople);
        ageComp.add(thirdPeople);

        System.out.println("__________________________________________");

        for (Person person : ageComp) {

            System.out.println(ageComp);
        }

//Requirement no. 2
        System.out.println("                 ");
        System.out.println("Requirement no. 2");


        Map<Person, List<Hobby>> personListHashMap = new HashMap<>();

        Person employeeOne = new Employee("Vlad", 30, "employed");
        Person studentOne = new Student("Bogdan", 25, "Contabilitate");

        Hobby hobbyOne = new Hobby("Cycling", 2);
        Hobby hobbyTwo = new Hobby("Fotball", 1);
        Hobby hobbyThree = new Hobby("Karate", 3);
        hobbyOne.addAddress("Aleea Babes", 55, "Romania");
        hobbyOne.addAddress("Calea Turzii", 120, "Romania");
        hobbyTwo.addAddress("Strada Muncii", 34, "Romania");
        hobbyThree.addAddress("X Street", 43, "Japan");
        //hobbyOne.listAdress();
        //System.out.println(hobbyOne);

        List<Hobby> hobbyList1 = new ArrayList<>();
        hobbyList1.add(hobbyOne);
        hobbyList1.add(hobbyTwo);

        List<Hobby> hobbyList2 = new ArrayList<>();
        hobbyList2.add(hobbyThree);

        personListHashMap.put(employeeOne, hobbyList1);
        personListHashMap.put(studentOne, hobbyList2);

        for (Map.Entry<Person, List<Hobby>> entry : personListHashMap.entrySet()) {

            List<Hobby> hobbies = entry.getValue();

            for (Hobby hobby : hobbies) {
                String daysOfPractice = null;

                switch (hobby.getFrequency()) {
                    case 2:
                        daysOfPractice = Day.MON.getName() + " and " + Day.Wed.getName();
                        break;
                    case 1:
                        daysOfPractice = Day.Sat.getName();
                        break;
                    case 3:
                        daysOfPractice = Day.Tue.getName() + ", " + Day.Thu.getName() + " and " + Day.Sun.getName();
                        break;
                    default:
                        System.out.println(Day.MON.getName());
                }


                System.out.println("Name: " + entry.getKey().getName() + " has the following hobby " + hobby.getHobbyName() + " which can be practice in " + hobby.getCountry() +
                        " on every " + daysOfPractice);

            }
        }
    }
}
