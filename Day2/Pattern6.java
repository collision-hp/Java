package Day2;

public class Pattern6 {
    public static void main(String[] args) {
        int n=1;
        for(int i=1;i<=6;i++){
            for(int j=i;j>=1;j--){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
