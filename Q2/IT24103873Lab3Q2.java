import java.util.Scanner;

public class IT24103873Lab3Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Monthly Salary
        System.out.print("Enter monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        
        // Input Number of OT Hours
        System.out.print("Enter number of OT hours: ");
        int otHours = scanner.nextInt();
        
        // Input OT Hourly Rate
        System.out.print("Enter OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
        
        // Calculate OT Amount and Total Salary
        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;
        
        // Display the Results
        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);
        
        scanner.close();
    }
}
