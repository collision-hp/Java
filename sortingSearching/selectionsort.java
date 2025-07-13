public class selectionsort {
    //selection-smallest(s)
    //1st element is assumed to be shortest 
    //sorted part gets on increasing unsorted part gets on decreasing
    //compare the i'th elememt i.e the smallest with all the next elements j the array 
    //update the smallest and compare with the next j'th elements
    //then swap i with the smallest found element
    public static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    // O(n^2)
    public static void selectionIterative(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            swap(arr, i, smallest);
        }
    }
    public static void printarr(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 8, 2 };
        int n = arr.length;
        selectionIterative(arr, n);
        printarr(arr);
    }
}