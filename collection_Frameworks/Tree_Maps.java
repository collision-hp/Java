package collection_Frameworks;
import java.util.*;
public class Tree_Maps {
    public static void main(String[] args) {
        //sorted version of the map
        //it is sorted on the basis of keys (i.e String here) that is alphabetically according to ascii value
        //log(N)
        Map<String,Integer> numbers=new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Five",5);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        //it updates the current key value
        numbers.put("Three", 6);

        System.out.println(numbers);
    }
}
