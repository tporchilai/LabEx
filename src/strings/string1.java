package strings;

public class string1 {
    public static void main(String[] args) {

        String original = "Hello, world!";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        // Create a StringBuilder object with the given string
        StringBuilder builder = new StringBuilder(str);

        // Use the reverse() method of StringBuilder to reverse the string
        builder.reverse();

        // Convert the StringBuilder object back to a String and return
        return builder.toString();
    }
}
