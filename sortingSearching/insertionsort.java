public class insertionsort {
    //opposite of bubble
    //smallest at the start
    //compare the current element with the previous elements
    //adjacent backward swapping
    public static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    public static void insertionIterative(int []arr){ //O(n^2)
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j-1, j);
                j--;
            }
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
