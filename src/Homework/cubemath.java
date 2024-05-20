package Homework;

import java.util.Scanner;

public class cubemath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X value");
        int x= sc.nextInt();


        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the y value");
        int y = sc1.nextInt();

        Scanner sc2 =new Scanner(System.in);
        System.out.println("Enter the Z value ");
        int z = sc2.nextInt();

        double result;
        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

    }
}
