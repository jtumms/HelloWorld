/**
 * Created by john.tumminelli on 5/21/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int array[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        shiftLeft(array, k);
        printArray(array);



    }
    public static void shiftLeft(int[] array, int k) {
        for (int j = 0; j < k; j++) {
            int a = array[0];
            int i;
            for (i = 0; i < array.length - 1; i++)
                array[i] = array[i + 1];
            array[i] = a;
        }
    }
    public static void printArray(int[] array){
        for (int x=0; x < array.length; x++){
            System.out.print(array[x] + " ");
        }
        System.out.println();
    }
}