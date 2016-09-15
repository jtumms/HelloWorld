import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by john.tumminelli on 9/14/16.
 */
public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "ALice";
        names[1] = "Bob";
        names[2] = "Charlie";

        //while loop
        int index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        //traditional for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // new for loop
        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<String> names2 = new ArrayList(); //<String> generic - arrayList can only contain strings
        names2.add("ALice");
        names2.add("Bob");
        names2.add("Charlie");
        System.out.println(names2.get(0)); //get method
        names2.remove(1);
        System.out.println(names2); //returns  out entire arraylist

        HashMap<String, Object> person = new HashMap();
        person.put("name", "Alice");
        person.put("age", 30);
        person.put("location", "Charleston");
        System.out.println(person);
        System.out.println(person.get("name"));
        person.put("name", "Bob");
        System.out.println(person.get("name"));

        String alice = names2.get(0);
        String bob = (String) person.get("name");





    }
}
