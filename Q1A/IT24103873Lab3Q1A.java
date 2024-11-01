import java.util.Scanner;

public class IT24103873Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Input the number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        // Calculate the total amount to pay
        double totalAmount = pricePerKg * kilograms;
        
        // Output the total amount
        System.out.printf("The total amount you have to pay is: %.2f\n", totalAmount);
        
        scanner.close();
    }
}
