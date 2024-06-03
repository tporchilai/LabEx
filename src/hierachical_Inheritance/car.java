package hierachical_Inheritance;

public class car extends vehicle
{




    @Override
    void wheel() {
        System.out.println("Car have 4 wheels"  +getClass());
    }

    @Override
    void colour() {
        super.colour();
    }

    @Override
    void seats() {
        super.seats();
    }
}
