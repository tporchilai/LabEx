public class functions3 {
    public static void main(String[] args) {
         int r1=  sum();
           int r2= sub();
           System.out.println(r1);
           System.out.println(r2);
           String s1=name();
           System.out.println(s1);

           
        
    }

    private static String name() {
        return "Mathematics";
    }

    private static int sub() {
        return 10 - 5 - 6;
    }

    private static int sum() {
        return 2 + 6;

    }
}
