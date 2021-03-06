/**
 * Created by john.tumminelli on 9/12/16.
 *
 * Ask about building constructors with nested arrays..
 */
public class Restaurant {
    String name;
    Addresses address;
    int openTime;
    int closeTime;
    String[] styles = new String[3];


    // Constructor added for Restaurant class
    Restaurant(String newName, Addresses newAddress, int newOpenTime, int newCloseTime, String[] newStyles) {
        setName(newName);
        setAddress(newAddress);
        setOpenTime(newOpenTime);
        setCloseTime(newCloseTime);
        setStyle(newStyles);
    }

    String getName() {
        return name;
    }

    Addresses getAddress() {
        return address;
    }

    int getOpenTime() {
        return openTime;
    }

    int getCloseTime() {
        return closeTime;
    }
    String getStyles;

    void setName(String newName) {
        name = newName;
    }

    void setAddress(Addresses newAddress) {
        address = newAddress;
    }

    void setOpenTime(int newOpenTime) {
        openTime = newOpenTime;
    }

    void setCloseTime(int newCloseTime) {
        closeTime = newCloseTime;
    }
    void setStyle(String[] newStyles) {
        styles = newStyles;
    }
}




