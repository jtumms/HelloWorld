/**
 * Created by john.tumminelli on 10/11/16.
 */
public class Excercise05 {
    public static void main(String[] args) {
        int num = 12345;
        // 54321
        String s = Integer.toString(num);

        for (int i = s.length() -1 ; i >= 0; i --){
            System.out.printf(String.valueOf(s.charAt(i)));
        }

        // use Stringbuilder
        int num2;
        StringBuilder sb = new StringBuilder(String. valueOf(num));
        sb.reverse();
        System.out.println(sb.toString());
        num2 = Integer.valueOf(sb.toString());
        System.out.println(num2);

        //use math
        num2 = 0;
        while (num != 0){
            num2 *= 10;
            num2 += num % 10;
            num /= 10;
        }
        System.out.println(num2);


    }

}
