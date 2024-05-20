package SwitchCondition;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operators");
        char c= sc.next().charAt(0);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double result;


        switch(c)
        {
            case '+':
                result = num1 + num2;
                System.out.print(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");

        }

    }

}
