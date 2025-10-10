package OOPS_4_Pillars;
abstract class Car{
    public abstract void stop();
}
class Toyota extends Car{
    public void stop(){
        System.out.println("Brake is presses");
        System.out.println("Mechanism to stop car using break");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        //toyota class extends car class
        Car fortuner=new Toyota();
        fortuner.stop();
    }
}
