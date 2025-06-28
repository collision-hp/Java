public class insertionsort {
    /*logic like the card game arrangement
    assume the 1st element is sorted
    variable current -curr
    compare the current element with the sorted part
    sorted part gets increasing gradually and the unsorted part gets decreased
    repeatedly compare the current element with its immediate previous element if less the swap of greater then stay*/
    public static void insertionIterative(int []arr){ //O(n^2)
        int n=arr.length;
        //we start from the 2nd element because 1st is assumed sorted
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){// < change the less than to greater then for decending order
                arr[prev+1]=arr[prev];
                prev--;
            }
            //because prev is decreased by one so now prev-1 is prev
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int [] arr={5,7,8,2,1};
        insertionIterative(arr);
        printArr(arr);
    }
}
