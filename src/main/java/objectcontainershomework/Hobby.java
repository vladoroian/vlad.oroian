package objectcontainershomework;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String hobbyName;
    private int frequency;
    List<Adress> adressList = new ArrayList<>();

    public Hobby(String hobbyName, int frequency) {

        this.hobbyName = hobbyName;
        this.frequency = frequency;
    }

    public void addAddress(String streetName, int streetNumber, String countryName) {

        Adress adress = new Adress(streetName, streetNumber);
        adress.addCountry(countryName);
        adressList.add(adress);
    }

    public void listAdress() {

        for (Adress adress : adressList) {

            System.out.println(adress);
        }
    }

    public String getCountry() {

        String country = null;

        for (Adress adress : adressList) {

            return country = adress.listCountry();
        }
        return country;
    }

    public String getHobbyName() {

        return this.hobbyName;
    }

    public int getFrequency() {

        return this.frequency;
    }

    public String toString() {

        return "Hobby name = " + hobbyName + ", frequency = " + frequency + ", " + adressList;
    }

}
