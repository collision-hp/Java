package collection_Frameworks;
import java.util.*;
public class Set_TreeSet {
    public static void main(String[] args) {
        // to arrange all the elements in sorted manner along with set properties
        // binary search tree is implemented
        Set<Integer> treeset=new TreeSet<>();
        treeset.add(32);
        treeset.add(67);
        treeset.add(32);
        treeset.add(12);
        treeset.add(65);

        System.out.println(treeset);
    }
}
