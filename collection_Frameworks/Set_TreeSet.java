package collection_Frameworks;
import java.util.*;
public class Set_TreeSet {
    public static void main(String[] args) {
        // to arrange all the elements in sorted manner along with set properties
        // binary search tree is implemented
        Set<Integer> set=new TreeSet<>();
        set.add(32);
        set.add(67);
        set.add(32);
        set.add(12);
        set.add(65);

        System.out.println(set);
    }
}
