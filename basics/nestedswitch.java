package basics;
import java.util.*;
public class nestedswitch {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        System.out.print("Enter empId: ");
        int empId = ni.nextInt();
        ni.nextLine(); // Consume leftover newline
        System.out.print("Enter department: ");
        String departmment = ni.nextLine();
        switch (empId) {
            case 1 -> System.out.println("Virat");
            case 2 -> System.out.println("Sreyas Iyer");
            case 3 -> {
                switch (departmment) {
                    case "IT" -> System.out.println("Salesforce");
                    case "HR" -> System.out.println("Recruiting");
                    default -> System.out.println("None");
                }
            }
            default -> System.out.println("Invalid empId");
        }
    }
}
