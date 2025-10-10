package OOPS_4_Pillars;
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swimming...");
    }
}
class Shark extends Fish{
    void hunt(){
        System.out.println("Hunting...");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Shark meg=new Shark();
        meg.eat();
        meg.swim();
        meg.hunt();
    }
}
