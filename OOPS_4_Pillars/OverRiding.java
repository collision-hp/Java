package OOPS_4_Pillars;
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Lion extends Animal{
    @Override
    void sound(){
        System.out.println("Lion roars");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Animal ax=new Lion();
        ax.sound();
    }
}
