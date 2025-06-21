import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Optionals {
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
        System.out.println(mp.get("rohit"));
        //optional is a container that helps to remove null value

        Optional<Integer> mark=Optional.ofNullable(mp.get("Rohit"));
        if(mark.isPresent()){
            System.out.println("There");
        }
        else{
            System.out.println("Error");
        }
    }
}
