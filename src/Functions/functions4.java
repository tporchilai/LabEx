public class functions4 {
    public static void main(String[] args) {
saySomething();    //no return no parameters


int result = sumoftwo(2,3);      // return with no parameters
System.out.println(result);

sayHello("chilai");    //no return with parameters

}

    private static String sayHello(String s){
        System.out.println("Hello "+ s); return s;
       }
    private static int sumoftwo(int a , int b){
 return a+b;
    }

    private static void saySomething() {
System.out.println("Nothing");
} }