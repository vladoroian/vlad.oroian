package objectcontainershomework;

public class Country {

    private String countryName;

    public Country(String countryName) {

        this.countryName = countryName;
    }

    public String getCountryName() {

        return this.countryName;
    }

    public String toString() {

        return "Country is = " + countryName;
    }

}
