package collection_Frameworks;
import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        //used on top of collection framework 
        //to implement operations like if an element is present in the collection or not,smallest and largest element, one element is repeated how many times
        List <Integer> list=new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(42);
        list.add(62);
        list.add(42);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(Collections.min(list));   
    }
}
