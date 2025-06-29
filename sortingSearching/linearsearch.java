public class linearsearch {
    public static int linear(int [] arr,int ele){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(ele==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,34,6,73,1,8};
        int result=linear(arr, 4);
        System.out.println(result);
        if(result==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found");
        }
    }
}
