package java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {

        System.out.println("1) Write 5 different instances of that object.");
        Person firstPerson = new Person("Vlad", 30, "Business analyst");
        Person secondPerson = new Person("Alexandru", 45, "Economist");
        Person thirdPerson = new Person("Marian", 18, "Student");
        Person forthPerson = new Person("George", 25, "Developer");
        Person fifthPerson = new Person("Mihai", 50, "Electrician");

        List<Person> people = new ArrayList<>();
        people.add(firstPerson);
        people.add(secondPerson);
        people.add(thirdPerson);
        people.add(forthPerson);
        people.add(fifthPerson);

        people.forEach(System.out::println);

        System.out.println("  ");
        System.out.println("2) Find the elements containing the letter \"a\" that start with \"M\" and print them out.");

        Set<Person> personSet = people.stream()
                .filter(person -> person.getName().contains("a"))
                .filter(person -> person.getName().startsWith("M"))
                .collect(Collectors.toSet());
        personSet.forEach(System.out::println);

        System.out.println("  ");
        System.out.println("3) Find the \"min\" using a custom comparing criteria of choice");

        Comparator<Person> sortByAge = Comparator.comparing(Person::getAge);
        Person youngestPerson = people.stream()
                .min(sortByAge)
                .orElseThrow(NoSuchElementException::new);
        System.out.println(youngestPerson);

        System.out.println("  ");
        System.out.println("4) Generate 5 random Strings and add them to a Set. Find the \"max\" (while explaining as Javadoc how comparing Strings works)");

        RandomString randomString = new RandomString();
        Random random = new Random();
        String firstString = randomString.generateRandomString(random, RandomString.characters, 5);
        String secondString = randomString.generateRandomString(random, RandomString.characters, 5);
        String thirdString = randomString.generateRandomString(random, RandomString.characters, 5);
        String forthString = randomString.generateRandomString(random, RandomString.characters, 5);
        String fifthString = randomString.generateRandomString(random, RandomString.characters, 5);

        Set<String> stringSet = new HashSet<>();
        stringSet.add(firstString);
        stringSet.add(secondString);
        stringSet.add(thirdString);
        stringSet.add(forthString);
        stringSet.add(fifthString);

        stringSet.forEach(System.out::println);


        /**
         * In variable maxString will be stored the character with maximum ASCII value
         */
        String maxString = stringSet.stream()
                .max(Comparator.comparing(String::valueOf))
                .orElse("There are no strings to compare");
        System.out.println("Maximum element in the stream is " + maxString);

        System.out.println("  ");
        System.out.println("5) Generate a random number of Integers and then count them. \"Map\" the exponential to the numbers and then print them out.");

        List<Integer> integerList = new ArrayList<>();

        Random randomInt = new Random();
        int totalGeneratedIntegers = randomInt.nextInt(20);
        for (int i = 0; i < totalGeneratedIntegers; i++) {

            Random random2 = new Random();
            int randomInteger = random2.nextInt(10);
            integerList.add(randomInteger);
        }

        integerList.forEach(System.out::println);
        System.out.println("Total generated numbers are " + integerList.stream().count());

/*        List<Double> doubleList = new ArrayList<>();
        for (Integer integer : integerList) {
            double exp = Math.exp(integer);
            doubleList.add(exp);
        }
        List<Double> exponentialList = (List<Double>) doubleList;*/

        List<Double> exponentialList = integerList.stream()
                .map(Integer -> Math.exp(Integer))
                .collect(Collectors.toList());

        exponentialList.forEach(System.out::println);

        System.out.println("  ");
        System.out.println("6) Create a map of \"n\" (K,V) elements and print \"how many\" elements have value over 10 (the key is of your choice)");

        Person sixthPerson = new Person("Bogdan", 5, "no profession");
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, firstPerson);
        personMap.put(2, secondPerson);
        personMap.put(3, thirdPerson);
        personMap.put(4, forthPerson);
        personMap.put(5, fifthPerson);
        personMap.put(6, sixthPerson);

        List<Person> overTenList = personMap.entrySet()
                .stream()
                .filter(Person -> Person.getValue().getAge() > 10)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        overTenList.forEach(System.out::println);
        System.out.println("Number of people that are older than 10 is " + overTenList.stream().count());

        System.out.println("  ");
        System.out.println("7) Sort the above Set<String> (used for max) in reverse order");

        List<String> reverseOrder = stringSet.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        reverseOrder.forEach(System.out::println);

        System.out.println("  ");
        System.out.println("8) Sort the above List of custom objects (used for filter) in an order you consider");

        List<Person> sortedPersonAlpha = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        sortedPersonAlpha.forEach(System.out::println);

        System.out.println("  ");
        System.out.println("9) Check if any of your instances \"match\" a condition based on an Integer field (of your choice). What does it return ? Print it out");

        boolean isThirtyYearsOld = people.stream()
                .anyMatch(Person -> Person.getAge() == 30);
        System.out.println("Are people that are 30 years old: " + isThirtyYearsOld);

        System.out.println("  ");
        System.out.println("10) What does Optional represent ? Explain through an example on your custom object");

        Optional<Person> optionalPerson = Optional.of(firstPerson);
        Person seventhPerson = new Person("abv", 100, "bcd");
        seventhPerson = null;
        Optional<Person> optionalPerson1 = Optional.ofNullable(seventhPerson);


        if (optionalPerson.isPresent()) {
            System.out.println(firstPerson);
        }

        if (optionalPerson1.isPresent()) {
            System.out.println(seventhPerson);
        } else {
            System.out.println("Wrapped value is null");
        }

        optionalPerson.ifPresent(System.out::println);

        System.out.println("  ");
        System.out.println("11) Fastest way to find the shortest String in a List (take the 5 random Strings generated above and find the shortest one)");
        //All generated random Strings are 5 characters long
        //Created another example

        String string1 = "abc";
        String string2 = "fda2121";
        String string3 = "3421314";
        String string4 = "4ff232";
        String string5 = "2342352342";
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(string1);
        stringArrayList.add(string2);
        stringArrayList.add(string3);
        stringArrayList.add(string4);
        stringArrayList.add(string5);

        Optional<String> shortestString = stringArrayList.stream()
                .reduce((word1, word2) -> word1.length() < word2.length() ? word1 : word2);

        shortestString.ifPresent(System.out::println);


    }

    public static class RandomString {

        static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";


        public String generateRandomString(Random random, String characters, int length) {

            char[] word = new char[length];
            for (int i = 0; i < length; i++) {
                word[i] = characters.charAt(random.nextInt(characters.length()));
            }

            return new String(word);
        }

    }

}
