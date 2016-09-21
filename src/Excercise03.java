import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by john.tumminelli on 9/21/16.
 */
public class Excercise03 {
    public static void main(String[] args) {
        String[] names =  {"alice", "bob", "charlie", "daniel", "andrew", "alex"};
        // ["bob", "charlie", "daniel"]
        ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));

        for (String name : names){
            if (name.charAt(0) == 'a'){
                namesArr.remove(name);
            }

        }
        System.out.println(namesArr);

        //iterator
        ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));
        Iterator<String> iter = namesArr.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.charAt(0) == 'a'){
                iter.remove();
            }
        }


    }
}
