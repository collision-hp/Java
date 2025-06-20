import java.util.*;

public class Lists {
    public static void main(String[] args) {
        //array list implementation
        List<Object> ar=new ArrayList<>();
        ar.add(1);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        List<String> str=new ArrayList<>();
        str.add("Hey There");
        str.add("Blud!!");
        str.add("How are You??");
        for (int i=0;i<str.size();i++){
            System.out.println(str.get(i));
        }
        //simple array implementation
        int[] arr={1,2,3};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
