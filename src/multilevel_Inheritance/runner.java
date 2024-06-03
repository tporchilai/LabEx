package multilevel_Inheritance;

public class runner {
    public static void main(String[] args) {
        child c = new child();
        c.car();
        c.home();
        System.out.println("***************************");
        father f = new father();
        f.car();
        f.home();
        System.out.println("***************************");
        grandfather g = new grandfather();
        g.home();
        System.out.println("***************************");
        // Dynamic Dispatch
        grandfather g1= new father();
        grandfather g2 = new child();
        g1.home();
        g2.home();
        System.out.println("***************************");
father f1= new child();
f1.car();
f1.home();

    }
}
