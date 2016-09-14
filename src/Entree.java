/**
 * Created by john.tumminelli on 9/12/16.
 */

// Class to define menu entree

public class Entree {
    String name;
    int calories;
    String description;
    String[] ingredients = new String[6];
    float price;

    /* Added Constrcutor for Entree Class */
    Entree(String newName, int newCalories, String newDescription, float newPrice){
        setName(newName);
        setCalories(newCalories);
        setDescription(newDescription);
        setPrice(newPrice);
    }

    void setName(String newName){
        name = newName;
    }
    void setCalories(int newCalories){
        calories = newCalories;
    }
    void setDescription(String newDescription){
        description = newDescription;
    }
    void setPrice(float newPrice){
        price = newPrice;
    }
    String getName(){
        return name;
    }
    int getCalories(){
        return calories;
    }
    String getDescription(){
        return description;
    }
    float getPrice(){
        return price;
    }


}


