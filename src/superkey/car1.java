package superkey;

public class car1 extends vehicle1{
    int max_speed=180;
    void display()
    {
        System.out.println("Max Speed of vehicle is ->" + super.max_speed);
        System.out.println("Max speed of car is ->" + this.max_speed);
    }
}
