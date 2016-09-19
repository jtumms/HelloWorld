import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by john.tumminelli on 9/19/16.
 * Depicts HashMaps with Array Lists inside
 */
public class Excercise01 {
    public static void
    main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Alex", "Beth"};
        // "A": ["Alice", "Alex"]
        // "B": ["Bob", "Beth"]
        // "C": ["Charlie"]
        // "D": ["David"]

        HashMap<String, ArrayList<String>> nameMap = new HashMap<String, ArrayList<String>>();

        // "A": []
        // "B": []
        // "C": []
        // "D": []

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            nameMap.put(firstLetter, new ArrayList<String>());
        }


        // looks like this now:
        // "A": []
        // "B": []
        // "C": []
        // "D": []

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            arr.add(name);
        }

        // Alternative Soulution:

        nameMap.clear();

        for (String name : names){
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            if (arr == null) {
                arr = new ArrayList<>();
            }
            arr.add(name);
            nameMap.put(firstLetter, arr);

            System.out.println(nameMap);
        }

    }
}
