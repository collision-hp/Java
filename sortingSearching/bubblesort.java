public class bubblesort {
    //opposite of insertion
    //greater at the end
    //adjacent forward swapping
    /*public static void swap(int a,int b){ 
    in this method the arguments are passed by values so swapping inside the swap method doesn't affect the original array elements.
        int x=a;
        a=b;
        b=x;
    }*/
    public static void swap(int arr[],int i,int j){
        int x=arr[i];
        arr[i]=arr[j];
        arr[j]=x;
    }
    public static void bubbleiterative(int arr[]){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void bubblerecursive(int arr[],int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr, i, i+1);
            }
        }
        bubblerecursive(arr, n-1);
    }

    public static void printarr(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,6,1,2};
        bubbleiterative(arr);
        printarr(arr);
        System.out.println("-----------------------------------------------------");
        bubblerecursive(arr, 5);
        printarr(arr);
    }
}
