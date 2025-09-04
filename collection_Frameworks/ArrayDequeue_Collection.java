package collection_Frameworks;
import java.util.*;
//here we can insert and pop elements from the 1st , last as well.
//pronouced as array deq.
public class ArrayDequeue_Collection {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offer(89);
        //to add the element in the 1st
        adq.offerFirst(12);

        //to add the element in the last
        adq.offerLast(32);

        System.out.println(adq);

        // it'll show the first element to be popped
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        //it'll pop the 1st element
        adq.poll();
        // adq.pollFirst();  OR
        System.out.println(adq);

        //to view what is the last element
        System.out.println(adq.peekLast());
        //it'll pop the last element
        adq.pollLast();
        System.out.println(adq);
    }

}
