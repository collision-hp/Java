import java.util.*;
public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("ab",90);
        mp.put("cd",80);
        mp.put("ef",89);
        for(Map.Entry<String,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-------------------");  
        }
    }
}
