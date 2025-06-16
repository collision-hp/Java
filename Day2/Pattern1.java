package Day2;

public class Pattern1 {
    public static void main(String[] args) {
        char c1='*';
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c1);
            }
            System.out.println();
        }
    }
}
