/**
 * Created by john.tumminelli on 9/12/16.
 */

// Class to store beer name, brewer and price

public class Beer {
    String name;
    float price;
    boolean isImported;
    String company;

    Beer(String newName, float newPrice, boolean newIsImported, String newCompany) {
        setName(newName);
        setPrice(newPrice);
        setIsImported(newIsImported);
        setCompany(newCompany);
    }
String getName() {
    return name;
}
float getPrice() {
    return price;
}
boolean getIsImported() {
    return isImported;
}
String getCompany() {
    return company;
}
void setName(String newName) {
    name = newName;
}
void setPrice(float newPrice) {
    if (isImported = true) {

        price = newPrice;
    }
    else {
        System.out.println("Sorry. You cannot change the price on imported beers.");
    }
}
void setIsImported(boolean newIsImported) {
    isImported = newIsImported;
}

    public void setCompany(String company) {
        this.company = company;
    }
}
