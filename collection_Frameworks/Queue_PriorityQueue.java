package collection_Frameworks;
import java.util.*;
public class Queue_PriorityQueue {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue=new PriorityQueue<>();
        queue.offer(9);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);

        // by default it is the min-heap (highest priority is given to minimum element)
        System.out.println(queue);
        //now you can notice that the order is changed because min-heap is implemented here
        //smallest element at the top
        //by default the highest priority element is the smallest element

        //to remove the highest priority element
        System.out.println(queue.poll());
        System.out.println(queue);

        //to know which is the next element to pop
        System.out.println(queue.peek());

        //to convert the min heal to max heap

        System.out.println("-----------------------------------------------------");

        Queue <Integer> queuemax=new PriorityQueue<>(Comparator.reverseOrder());
        //now the 1st element will be the largest
        queuemax.offer(50);
        queuemax.offer(9);
        queuemax.offer(6);
        
        System.out.println(queuemax);

    }
}
