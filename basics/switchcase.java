package basics;
import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner ni=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=ni.nextInt();
        int cgpa=marks/10;
        switch(cgpa){
            case 10:
            case 9:
            System.out.println("A");break;
            case 8:
            System.out.println("B");break;
            case 7:
            System.out.println("C");break;
            case 6:
            System.out.println("D");break;
            case 5:
            System.out.println();break;
            default:
            System.out.println("Fail");break;
        }
        //new syntax
        //break not required
        switch(cgpa){
            case 10,9->System.out.println("A");
            case 8->System.out.println("B");
            case 7->System.out.println("C");
            case 6->System.out.println("D");
            case 5->System.out.println("E");
            default->System.out.println("Fail");
        }
        ni.close();
    }
}
