//quick sort is slightly better than merge sort
//6,2,5,4,7,9,1,3
//pick up a pivot (any element by your choice) we choose middle
//let pivot is the middle element of the array -> 4
//smaller on the left(2,1,3) and large on the right(6,5,7,9)
//(2,1,3) is an individual array
//again pick up the pivot -> 1
//{2},{3} are individual arrays so no need to sort them
//similarly (6,5,7,9) 
//we'll be using lows and high pointers to know on which part of the array we're working on.
//start and end to swap the elements
//pivot=arr[mid]
//figure out the element from the left start which is greater then the pivot, simultaneously figure out the from the right end which is less than the pivot.

import java.util.Arrays;

public class quicksort {
    public static void quick(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int i = low;
        int j = high;
        int m = i + (j - i) / 2; //mid
        int pivot = arr[m];
        while (i <=j) {
            // check untill the condition is true
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
               j--;
            }
            // if the conditions are violated the if condition is implemented
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        // now the pivot element is at the correct position so sort the 2 halves
        quick(arr, low, j);
        quick(arr, i, high);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 2, 9 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
