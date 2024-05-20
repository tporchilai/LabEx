import java.util.Scanner;



public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 ");
        int num2 = sc.nextInt();


        int result1 = sum(num1, num2);
        int result2 = sub(num1, num2);
        int result3 = mul(num1, num2);
        int result4 = div(num1, num2);


        System.out.println("sum is --> " + result1);
        System.out.println("sub is --> "+ result2);
        System.out.println("mul is --> "+ result3);
        System.out.println("div is --> " + result4);
    }

    private static int div(int num1, int num2) {
        return num1/num2;
    }

    private static int mul(int num1, int num2) {
        return num1*num2;
    }

    private static int sub(int num1, int num2) {
        return num1-num2;
    }

    private static int sum(int num1, int num2) {
        return num1+num2;
    }
}