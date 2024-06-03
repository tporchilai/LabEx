package superkey;

public class run {
    public static void main(String[] args) {
        car1 c = new car1();
        vehicle1 v = new vehicle1();
        int speed = c.max_speed;
        int speed1 = v.max_speed;
        System.out.println(speed);
        c.display();
        System.out.println(speed1);
    }
}
