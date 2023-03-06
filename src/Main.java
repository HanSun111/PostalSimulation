import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        System.out.println("I give 4 choice, you pick");
        System.out.println("1. Calculate cost of 1 package");
        System.out.println("2. Simulate packages");
        System.out.println("3. How we calculate packages");
        System.out.println("4. quit");

        while (choice != 4) {
            choice = s.nextInt();
            if(choice == 1){
                System.out.println("Enter zip of where package came from: ");
                String from = s.nextLine();
                System.out.println("Enter zip of where package is going: ");
                String to = s.nextLine();
                System.out.println("Enter weight of package: ");
                double lbs = s.nextDouble();
                System.out.println("Enter width of package: ");
                double w = s.nextDouble();
                System.out.println("Enter length of package: ");
                double l = s.nextDouble();
                System.out.println("Enter height of package: ");
                double h = s.nextDouble();
                System.out.println("Cost: " + PostalCalculator.CalculatePostage(from, to, lbs, w + l + h));
            }
        }

    }
}
