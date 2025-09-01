package collection_Frameworks;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        //operations performed on arrays LIKE- SORTING, SEARCHING ,CONVERTING TO ARRAY LIST, CHECK IF 2 ARRAYS ARE EQUAL OR NOT

        int [] numbers={1,2,3,4,5,6,7};
        int index=Arrays.binarySearch(numbers, 5);
        System.out.println(index);
        System.out.println("-------------------------------------------------");
        int [] arr={8,32,5,56,6};
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
         System.out.println("------------------------------------------------");
        int [] arr1=new int[3];
        //fill the array with the particular element
        Arrays.fill(arr1,12);
        for(int i:arr1){
            System.out.println(i);
        }
    }
}
