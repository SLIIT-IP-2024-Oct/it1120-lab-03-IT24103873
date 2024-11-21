import java.util.Scanner;

    public class IT24103873Lab3Q4{
        public static void main(String [] args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a five-digit number: ");
                int number = scan.nextInt();

                int digit1 = number / 10000;
                int digit2 = (number / 1000) %10;
                int digit3 = (number / 100) %10;
                int digit4 = (number / 10) %10;
                int digit5 = number %10;

                System.out.print(digit1);
                System.out.print(" ");
                System.out.print(digit2);
                System.out.print(" ");
                System.out.print(digit3);
                System.out.print(" ");
                System.out.print(digit4);
                System.out.print(" ");
                System.out.print(digit5);
                System.out.print(" ");


            
        }
    }