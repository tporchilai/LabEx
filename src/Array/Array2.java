package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        System.out.println("Print all the marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of the Student");
        String name = sc.nextLine();
        System.out.println(name);
        int numMarks = sc.nextInt();
        int [] marks = new int[numMarks];
        System.out.println("Enter the Marks");
        for (int i = 0; i < numMarks; i++) {
            marks[i]= sc.nextInt();
        }
System.out.println("Marks Entered");
        for (int mark:marks) {
            System.out.println(mark);
        }

        }
}
