package superkey;
public class animal {
    String type;

    public animal() {
        System.out.println("Animals types");
    }

    public animal(String type) {
        this.type = type;
    }
}

 class Dog extends animal {
    String breed;

    public Dog() {
        super("Dog");
        System.out.println("The dog types");
    }

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    void display1() {
        System.out.println(super.type + " Type: Dog, Breed: " + this.breed);
    }


    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.display1();

        Dog d2 = new Dog("Labrador retriever");
        d2.display1();
animal a1 = new animal();
        String t1 = a1.type;
System.out.println(t1);
    }
}



