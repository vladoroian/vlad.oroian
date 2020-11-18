package objectcontainerpractice;

import java.util.Arrays;

public class Main {

    public static void main(String... args) {

        int[] firstList;

        firstList = new int[3];

        firstList[0] = 100;
        firstList[1] = 200;
        firstList[2] = 300;

/*        for (int arrayMember : firstList) {
            System.out.println(arrayMember);
        }*/

        int[][] firstMatrix = new int[3][];
        firstMatrix[0] = new int[2];
        firstMatrix[1] = new int[3];
        firstMatrix[2] = new int[1];

        firstMatrix[0][0] = 10;
        firstMatrix[0][1] = 20;
        firstMatrix[1][0] = 1;
        firstMatrix[1][1] = 2;
        firstMatrix[1][2] = 3;
        firstMatrix[2][0] = 7;

        for (int i = 0; i < firstMatrix.length; i++) {

            System.out.println(firstMatrix[i][0]);
        }

        Person[] personList = new Person[3];
        Person somer = new Somer("Vasile Pop");
        Person angajat = new Angajat("Mihai Popescu");
        Person student = new Student("Ioan Lazarescu");

        personList[0] = somer;
        personList[1] = angajat;
        personList[2] = student;

        for (Person person : personList) {

            System.out.println(person.toString());
        }

        for (int i = 0; i < personList.length; i++) {

            System.out.println(personList[i]);
        }

        int[] input = {1, 3, 9, 5, 8, 9, 5};
        sortArray(input);
        System.out.println(Arrays.toString(input));

        String[] stringSort = {"a", "d", "c", "b"};
        Arrays.sort(stringSort);
        System.out.println(Arrays.toString(stringSort));

        int[] myArray = {3, 4, 5};
        int sum = 0;
        for (int i : myArray)
            sum += i;
        System.out.println(sum);
    }

    public static void sortArray(int[] input) {
        Arrays.sort(input);
        for (int sortNo : input) {
            System.out.println(sortNo);
        }
    }


}


