package polymorphism;

public class methodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        Hound h = new Hound();
        h.bark();
        Dog d1 = new Hound();
        d1.bark();
    }

}
class Dog{
    void  bark(){
        System.out.println("I am a dog , I will bark ");
    }
}
class Hound extends Dog{
    void bark(){
        System.out.println("I am hound , I will Sniff ");
    }
}