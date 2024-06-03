package polymorphism;

public class methodOverloading {
    void Gift(String a){
        System.out.println("A is a String -> " +  a);
    }
    void Gift(int a){
        System.out.println("A is a Integer -> " +  a);
    }
    void Gift(float a){
        System.out.println("A is a Float -> " +  a);
    }
    void Gift(double a){
        System.out.println("A is a Double -> " +  a);
    }

    public static void main(String[] args) {
        methodOverloading mo = new methodOverloading();
        mo.Gift(10);
        mo.Gift("Priya");
        mo.Gift(23.22F);
        mo.Gift(1.23456D);
    }
}
