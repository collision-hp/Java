package collection_Frameworks;
import java.util.*;
public class Queue_PriorityQueue {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(9);
        pq.offer(5);
        pq.offer(6);
        pq.offer(7);
        pq.offer(8);

        // by default it is the min-heap (highest priority is given to minimum element)
        System.out.println(pq);
        //now you can notice that the order is changed because min-heap is implemented here
        //smallest element at the top
        //by default the highest priority element is the smallest element

        //to remove the highest priority element
        System.out.println(pq.poll());
        System.out.println(pq);

        //to know which is the next element to pop
        System.out.println(pq.peek());

        //to convert the min heal to max heap

        System.out.println("-----------------------------------------------------");

        Queue <Integer> pqmax=new PriorityQueue<>(Comparator.reverseOrder());
        //now the 1st element will be the largest
        pqmax.offer(50);
        pqmax.offer(9);
        pqmax.offer(6);
        
        System.out.println(pqmax);

    }
}
