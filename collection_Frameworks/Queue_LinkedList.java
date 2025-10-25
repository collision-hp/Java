package collection_Frameworks;
import java.util.*;
public class Queue_LinkedList {
    //FIFO
    public static void main(String[] args) {
        //Linked list class is implementing the queue interface 
        //so basically all the functions of queue will be accessible by linkedlist class
        //queue is the reference variable of Queue
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(12); 
        queue.offer(24); 
        queue.offer(36); 
        System.out.println(queue);

        //to pop an element from the 1st
        System.out.println(queue.poll());
        System.out.println(queue);

        // just tell us which element is next or about to be popped
        System.out.println(queue.peek());
    }
}
