package Functions;

public class functions5 {
    public static void main(String[] args) {
         f1();
String[] name ={"hello","hi"};
f3(name);
    }

    private static void f2() {

        System.out.println("f2");
    }

    private static void f1() {
        f2();
        System.out.println("f1");

    }
    private static void f3(String[] a) {
for (String name: a)        // for each loop
        System.out.println(name);
    }

}
