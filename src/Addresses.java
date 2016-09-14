/**
 * Created by john.tumminelli on 9/12/16.
 */

//restaurant addresses class

public class Addresses {
    String street;
    String city;
    String state;
    String country;
    int zipCode;

    Addresses(String newStreet, String newCity, String newState, String newCountry, int newZip) {
        setStreet(newStreet);
        setCity(newCity);
        setState(newState);
        setCountry(newCountry);
        setZipCode(newZip);
    }
    String getStreet() {
        return street;
    }
    String getCity() {
        return city;
    }
    String getState() {
        return state;
    }
    String getCountry() {
        return country;
    }
    int getZipCode() {
        return zipCode;
    }
    void setStreet(String newStreet) {
        street = newStreet;
    }
    void setCity(String newCity) {
        city = newCity;
    }
    void setState(String newState) {
        state = newState;
    }
    void setCountry(String newCountry) {
        country = newCountry;
    }
    void setZipCode(int newZip) {
        zipCode = newZip;
    }

}

