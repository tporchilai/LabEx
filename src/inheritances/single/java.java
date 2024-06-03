package inheritances.single;

public class java extends programming {
    String newFeature;

public java(){
    System.out.println("+++++++++++++++++++++++++++++++");
    }
    public java (String newFeature){
    this.newFeature = newFeature;
    }

    @Override
    void printInfo() {
        System.out.println("Feature  is ->" +  this.newFeature);
    }
}