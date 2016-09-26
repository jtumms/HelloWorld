import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by john.tumminelli on 9/26/16.
 */
public class Excercise04 {
    public static void main(String[] args) {
        String[] names = {"charlie", "david", "chuck", "bob", "alice", "andrew"};
        ArrayList<String> sortedNames = new ArrayList<>();
        //sorted names should contain the names alphabetically

        for (String name : names){
            int index = 0;
            //find the correct index
            for (String sortedName : sortedNames){
                if (name.compareTo(sortedName) > 0){
                    index++;
                }
                else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);


    }
}
