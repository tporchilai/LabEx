package strings;

import java.util.Arrays;
import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {




        string4.args = args;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String char1 = sc.nextLine();
        System.out.println("Enter the 2nd string");
        String char2 = sc.nextLine();
        if (char1.length() != char2.length()) {
            return ;
        } else {
            char[] charArray1 = char1.toCharArray();
            char[] charArray2 = char2.toCharArray();

            return Arrays.equals(charArray1, charArray2);
        }

    }
}
