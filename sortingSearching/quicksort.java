//quick sort is slightly better than merge sort
//4,6,2,5,7,9,1,3
//pick up a pivot (any element by your choice)
//let pivot is the 1st element of the array -4
//smaller on the left(2,1,3) and large on the right(6,5,7,9)
//(2,1,3) is an individual array
//again pick up a pivot- 2
//{1},{3} are individual arrays so no need to sort them
//similarly (6,5,7,9) is an individual array
//6 is the pivot
//{5} is sorted with 6, now {7,9} is an individual array repeat the same process
//we'll be using lows and high pointers rather then dividing into 2 arrays
//pivot=arr[low]
//figure out the element from the left wich is greater then the pivot, simultaneously figure out the 1st element from the right which is less than the pivot.
//Ex- greater 6 ,smaller 3 ->swap them
// Then 5,1 ->swapped
//then 7,1(from the right)-> swap

public class quicksort {
    public static void quickorting(int[] arr,int low,int high){
        if(low<high){
            
        }
    }
}
