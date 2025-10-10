package OOPS_4_Pillars;
class Calculator{
    int add(int a){
        return a+10;
    }
    int add(int x,int y){
        return x+y;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.add(5));
        System.out.println(calc.add(20, 30));
        System.out.println(calc.add(50.0, 30.0));
    }
}
