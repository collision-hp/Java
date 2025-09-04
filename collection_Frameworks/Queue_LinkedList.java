package collection_Frameworks;
import java.util.*;
public class Queue_LinkedList {
    //FIFO
    public static void main(String[] args) {
        //Linked list class is implementing the queue interface 
        //so basically all the functions of queue will be accessible by linkedlist class
        Queue<Integer> ll=new LinkedList<>();
        ll.offer(12); 
        ll.offer(24); 
        ll.offer(36); 
        System.out.println(ll);

        //to pop an element from the 1st
        System.out.println(ll.poll());
        System.out.println(ll);

        // just tell us which element is next or about to be popped
        System.out.println(ll.peek());
    }
}
