package collection_Frameworks;

import java.util.*;

public class Set_LinkedHashset {
    public static void main(String[] args) {

        // here the order is maintained in which they are added
        Set<Integer> set = new LinkedHashSet<>();

       set.add(32);
       set.add(67);
       set.add(32);
       set.add(12);
       set.add(65);

        System.out.println(set);
    }
}
