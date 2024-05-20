package classandobjects;

public class class1 {
    public static void main(String[] args) {
System.out.println("It's about my Self");
Person p1 = new Person();
p1.name = "Porchilai";
p1.age = 30;
p1.phone_no = 98_766_543_210L;
p1.address = new String[]{"new car street"};
p1.DOB = "1.01.2002";
p1.eye_colour = "Black";
p1.isMale = false;
p1.height = 6.2;
p1.salary = 110000;
System.out.println(p1.name);

p1.walk();
p1.talk();
p1.sleep();


    }
}
