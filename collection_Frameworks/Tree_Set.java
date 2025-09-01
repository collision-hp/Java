package collection_Frameworks;
import java.util.*;
public class Tree_Set {
    public static void main(String[] args) {
        // to arrange all the elements in sorted manner along with set properties
        // binary search tree is implemented
        Set<Integer> hashset=new TreeSet<>();
        hashset.add(32);
        hashset.add(67);
        hashset.add(32);
        hashset.add(12);
        hashset.add(65);

        System.out.println(hashset);
    }
}
