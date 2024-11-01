import java.util.Scanner;

public class IT24103873Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Input the number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        // Calculate the total amount before discount
        double totalAmount = pricePerKg * kilograms;
        
        // Calculate the discount (10% of total amount)
        double discount = totalAmount * 0.10;
        
        // Calculate the final amount after discount
        double finalAmount = totalAmount - discount;
        
        // Output the final amount to pay
        System.out.printf("The total amount you have to pay after discount is: %.2f\n", finalAmount);
        
        scanner.close();
    }
}
