package collection_Frameworks;

import java.util.*;

public class Set_LinkedHashset {
    public static void main(String[] args) {

        // here the order is maintained in which they are added
        Set<Integer> hashset = new LinkedHashSet<>();

        hashset.add(32);
        hashset.add(67);
        hashset.add(32);
        hashset.add(12);
        hashset.add(65);

        System.out.println(hashset);
    }
}
