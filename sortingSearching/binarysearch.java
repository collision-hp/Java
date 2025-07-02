public class binarysearch {
    public static int binary(int []arr,int ele){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,43,234,5654,34566};
        int result=binary(arr, 234);
        System.out.println(result);
    }
}
