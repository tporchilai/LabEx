import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int y = scanner1.nextInt();


        Scanner scanner2 = new Scanner(System.in);
        int z = scanner2.nextInt();
        int maxi, maximum;
        maxi=Math.max(x,y);
        maximum = (maxi> z)?maxi:z;
        System.out.println(maximum);

    }
}
