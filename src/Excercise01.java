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
        for (String i : names){
            System.out.println(i);
        }
        // "A": ["Alice", "Alex"]
        // "B": ["Bob", "Beth"]
        // "C": ["Charlie"]
        // "D": ["David"]

        HashMap<String, ArrayList<String>> nameMap = new HashMap<String, ArrayList<String>>();
        System.out.println(nameMap);

        // "A": []
        // "B": []
        // "C": []
        // "D": []

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            System.out.println(firstLetter);
            nameMap.put(firstLetter, new ArrayList<String>());
        }
        System.out.println(nameMap);


        // looks like this now:
        // "A": []
        // "B": []
        // "C": []
        // "D": []

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            arr.add(name);
            System.out.println(arr);
        }


        // Alternative Solution:

//        nameMap.clear();
//
//        for (String name : names){
//            String firstLetter = String.valueOf(name.charAt(0));
//            ArrayList<String> arr = nameMap.get(firstLetter);
//            if (arr == null) {
//                arr = new ArrayList<>();
//            }
//            arr.add(name);
//            nameMap.put(firstLetter, arr);
//
//
//        }




        System.out.println(nameMap);
        System.out.println(nameMap.get("A"));
        System.out.println(nameMap.get("B"));
        System.out.println(nameMap.get("C"));
        System.out.println(nameMap.get("D"));


    }
}
