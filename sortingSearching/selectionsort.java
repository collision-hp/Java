public class selectionsort {
    //smaller at the beginning
    public static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    // O(n^2)
    public static void selectionIterative(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    smallest = j;
                }
            }
            swap(arr, i, smallest);
        }
    }
    public static void printarr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 8, 2 };
        int n = arr.length;
        selectionIterative(arr, n);
        printarr(arr);
    }
}