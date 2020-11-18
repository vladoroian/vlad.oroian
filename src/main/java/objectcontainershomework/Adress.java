package objectcontainershomework;

import java.util.ArrayList;
import java.util.List;

public class Adress {

    private String streetName;
    private int streetNumber;
    List<Country> countryList = new ArrayList<>();


    public Adress(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public void addCountry(String countryName) {

        Country country = new Country(countryName);
        countryList.add(country);
    }

    public String listCountry() {

        String countryName = null;

        for (Country country : countryList) {

            return countryName = country.getCountryName();
        }

        return countryName;
    }

    public String toString() {

        return "Street name = " + streetName + ", Street number = " + streetNumber + ", " + countryList;
    }
}
