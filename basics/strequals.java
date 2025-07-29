package basics;

import java.util.Scanner;

public class strequals {
    public static void main(String[] args) {
        Scanner ni= new Scanner(System.in);
        String fruit=ni.nextLine();
        System.out.println(fruit.equals("mango"));
        String a="Virat";
        String b="Virat";
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
