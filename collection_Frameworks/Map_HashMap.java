package collection_Frameworks;
import java.util.*;
public class Map_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new HashMap<>();
        //Keys are always unique
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Five",5);
        numbers.put("Three", 3);
        //it updates the current key value
        numbers.put("Three", 6);

        //if you want to put an element that is unique only 
        // if(!numbers.containsKey("Two")){
        //     numbers.put("Two",23);
        // }
        //OR 
        numbers.putIfAbsent("Two", 43);
        System.out.println(numbers);

        //to check if the value is present or not
        System.out.println(numbers.containsValue(6));

        //to ckeck if the map is empty or not
        System.out.println(numbers.isEmpty());

        //to remove any key
        numbers.remove("One");
        System.out.println(numbers);

        //iterating
        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //  OR
        numbers.forEach((letter,numb)->System.out.println(letter+" "+numb));

        //TO GET KEYS OR VALUES only
        for(String key: numbers.keySet()){
            System.out.println(key);
        }
    }
}
