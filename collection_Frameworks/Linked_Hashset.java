package collection_Frameworks;

import java.util.*;

public class Linked_Hashset {
    public static void main(String[] args) {

        // here the order is maintained in ehich they are added
        Set<Integer> hashset = new LinkedHashSet<>();

        hashset.add(32);
        hashset.add(67);
        hashset.add(32);
        hashset.add(12);
        hashset.add(65);

        System.out.println(hashset);
    }
}
