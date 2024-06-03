package inheritances.single;

public class run {
    public static void main(String[] args) {
        programming p = new programming("java" , "Ko posan" , 1.21F);
        java j = new java("lambda exp");
        p.printInfo();
        j.printInfo();
    }
}
