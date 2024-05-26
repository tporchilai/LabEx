package strings;

import java.util.Arrays;
import java.util.Scanner;


public class areAnagrams {
    public static boolean areAnagrams1(String str1, String str2) {
        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

    System.out.println("Enter the str1");
    String str1 = sc.nextLine();
    System.out.println("Enter the str2");
        String str2 = sc.nextLine();

        if (areAnagrams1(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
