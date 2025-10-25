package collection_Frameworks;
import java.util.*;

public class Set_HashSet {
    public static void main(String[] args) {

        //set prints only the unique values not the repetitive values
        //order is not defined printed in random order
        //HashSet class implements Set interface
        //properties of set can be implemented in hashset now
        //set is the Set reference variable.
        Set <Integer> set=new HashSet<>();

        set.add(32);
        set.add(67);
        set.add(32);
        set.add(12);
        set.add(65);

        System.out.println(set);

        //to remove an element
        set.remove(65);
        System.out.println(set);
        //to check whether the element is there in the set or not it returns a boolean value
        System.out.println(set.contains(32));

        //to check whether our set is empty or not returns a boolean value
        System.out.println(set.isEmpty());

        //to check how many elements are present in the set
        System.out.println(set.size());

        //to clear the set
        set.clear();
        System.out.println(set);
    }
}
