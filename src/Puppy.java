/**
 * Created by john.tumminelli on 9/13/16.
 */
public class Puppy {
    int puppyAge;
    int puppyWeight;

    public Puppy(String name, String breed) {
        // This constructor has two parameters, name and breed.
        System.out.println("Name chosen is: " + name + " And the breed is: " + breed);
        if (breed == "Bulldog") {
            System.out.println("That is my favorite breed");
        }
        else {
            System.out.println("I am not a fan of the " + breed + " breed");
        }
    }

    public void setAgeWeight(int age, int weight) {
        puppyAge = age;
        puppyWeight = weight;
    }

    public int getAgeWeight() {
        System.out.println("Puppy's age is: " + puppyAge);
        System.out.println("Puppy's weight is: " + puppyWeight);
        return puppyAge;
    }

    public static void main(String[] args) {
      /* Object creation */
        Puppy myPuppy = new Puppy("tommy","Bulldog");

      /* Call class method to set puppy's age */
        myPuppy.setAgeWeight(2,65);

      /* Call another class method to get puppy's age */
        myPuppy.getAgeWeight();

      /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}

