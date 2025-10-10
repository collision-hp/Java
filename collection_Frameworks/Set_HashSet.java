package collection_Frameworks;
import java.util.*;

public class Set_HashSet {
    public static void main(String[] args) {

        //set prints only the unique values not the repetitive values
        //order is not defined printed in random order
        //HashSet class implements Set interface
        //properties of set can be implemented in hashset now
        //nature will be hashset
        Set <Integer> hashset=new HashSet<>();

        hashset.add(32);
        hashset.add(67);
        hashset.add(32);
        hashset.add(12);
        hashset.add(65);

        System.out.println(hashset);

        //to remove an element
        hashset.remove(65);
        System.out.println(hashset);
        //to check whether the element is there in the set or not it returns a boolean value
        System.out.println(hashset.contains(32));

        //to check whether our set is empty or not returns a boolean value
        System.out.println(hashset.isEmpty());

        //to check how many elements are present in the set
        System.out.println(hashset.size());

        //to clear the set
        hashset.clear();
        System.out.println(hashset);
    }
}
