import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int score=sc.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("Your grade is A");
        } else if (score>=80 && score<=89)
        {
            System.out.println("Your grade is B");
        } else if (score>=70 && score<=79)
        {
            System.out.println("Your grade is c");
        } else if (score>=60 && score<=69)
        {
            System.out.println("your grade is D");
        } else if (score>=0 && score<=59)
        {
            System.out.println("your grade is F");
        } else {
            System.out.println("LOL");
        }
        sc.close();
    }
}
