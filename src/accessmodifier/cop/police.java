package accessmodifier.cop;

public class police {
    public static int gun ;


    public police(int gun) {
        this.gun = gun;
    }
   // private void canIShoot(){
     //   System.out.println("of_course, Shoot");
    protected void canIShoot(){
        System.out.println("of course, you can with permission");
    }
}
