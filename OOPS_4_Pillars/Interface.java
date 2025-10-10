package OOPS_4_Pillars;
interface Food{
    void display();
    void show();
}
class Momo implements Food{
    public void display(){
        System.out.println("Displayed");
    }
    public void show(){
        System.out.println("Shown");
    }
}
public class Interface {
    public static void main(String[] args) {
        Momo steam=new Momo();
        steam.display();
        steam.show();
    }
}
