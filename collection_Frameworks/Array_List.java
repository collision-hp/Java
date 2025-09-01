package collection_Frameworks;
import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        List <String> student=new ArrayList<>();
        student.add("Raj");
        student.add("Krish");
        student.add("Kohli");
        System.out.println(student);

        //to iterate over the list each element
        for(int i=0;i<student.size();i++){
            System.out.println(student.get(i));
        }
        System.out.println("-------------------------------------------------");

        for(String i:student){
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------");

        //iterator
        Iterator<String> it=student.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------------------------------------");



        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //To add an element at any desired position in between elements
        list.add(1,50); //this will add 50 at the 1st index;
        System.out.println(list);

        //appending a list to another list
        List <Integer> newlist=new ArrayList<>();
        newlist.add(70);
        newlist.add(80);

        list.addAll(newlist);
        System.out.println(list);

        //to get element from list
        System.out.println(list.get(5));

        //to remove an element using the index of that element
        list.remove(5);//should remove 80
        System.out.println(list);

        //to remove a element directly without taking index reference
        list.remove(Integer.valueOf(50));//if this value is there in the list it will remove that
        System.out.println(list);

        //to update any value at any position
        list.set(1, 200);
        System.out.println(list);

        //to check if any element is present in the list or not returns a boolean value
        boolean ans= list.contains(70);
        System.out.println(ans);

        //to clear the list
        list.clear();
        System.out.println(list);
    }
}
