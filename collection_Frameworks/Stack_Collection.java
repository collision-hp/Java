package collection_Frameworks;
import java.util.*;
public class Stack_Collection {
    public static void main(String[] args) {
        //LIFO ->LAST IN FIRST OUT
        Stack<String> animal=new Stack<>();
        animal.push("Lion");
        animal.push("Wolf");
        animal.push("Panther");
        System.out.println(animal);
        //to get which is the last element at the top
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal);
    }
}
