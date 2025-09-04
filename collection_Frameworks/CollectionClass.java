package collection_Frameworks;
import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        //used on top of collection framework 
        //to implement operations like if an element is present in the collection or not,smallest and largest element, one element is repeated how many times
        List <Integer> arrlist=new ArrayList<>();
        arrlist.add(12);
        arrlist.add(2);
        arrlist.add(42);
        arrlist.add(62);
        arrlist.add(42);
        Collections.sort(arrlist);
        System.out.println(arrlist);
        Collections.sort(arrlist,Comparator.reverseOrder());
        System.out.println(Collections.min(arrlist));   
    }
}
