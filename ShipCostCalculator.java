import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {


        // Ask user for item price
        // Validate input
        // If price >= 100, shipping is free
        // Else, shipping is 2% of price
        // Display shipping cost and total price
        
        try (Scanner in = new Scanner(System.in)) {
            double price;
            double shipping;
            double total = 0;
            

            System.out.print("Enter the price of the item: ");

            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();

                if (price >= 100) {
                    shipping = 0;
                }
                else {
                    shipping = price * 0.02;
                }
            
            total = price + shipping;

            System.out.println("Shipping cost: $" + shipping);
            System.out.println("Total price: $" + total); 
        }
            else {
                System.out.println("Invalid input: " + total);
                System.out.println("Run the program again and enter a valid number.");
            }
        }
    }

}