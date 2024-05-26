package constructors;

public class constructor2 {
    public static void main(String[] args) {
        constructor1 conref1 = new constructor1();  // default constructor
        System.out.println(conref1.name);  // name initialization from the class

        conref1.name="Tamil";  // name initialization
        System.out.println(conref1.name);


        constructor1 constru1 = new constructor1("ram",false);// parameterized constructor
            System.out.println(constru1.name);


    }
}
