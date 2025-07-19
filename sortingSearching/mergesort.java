public class mergesort {
    //we're diving breaking into 2 parts and then combining
    //it's a recursion
    //we need a base case
    public static void mergesorting(int []arr,int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mergesorting(arr, low, mid);
        mergesorting(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high){
        int n=arr.length;
        int []temparr= new int[n];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temparr[k++]=arr[i++];
            }
            else{
                temparr[k++]=arr[j++];
            }
        }
        //adding the remaining elements of both arrays
        while(i<=mid){
            temparr[k++]=arr[i++];
        }
        while(j<=high){
            temparr[k++]=arr[j++];
        }
        //now we need to copy the temporary array to the original array
        for(int x=0;x<k;x++){
            arr[low+x]=temparr[x];
        }
    }
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int [] arr={5,9,3,2,1};
        mergesorting(arr, 0, 4);
        printArr(arr);
    }
}
