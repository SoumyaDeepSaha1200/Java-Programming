package basic;
//A shopkeeper offers a 10% discount on the printer price and a 6% sales tax on the remaining amount. Write a program to calculate the total amount to be paid by the customer.
import java.util.Scanner;
               
public class p26 {
               
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
                       
          // Input: Printer price
          System.out.print("Enter the price of the printer: ");
          double price = scanner.nextDouble();
                       
          // Step 1: Apply 10% discount
          double discount = 0.10 * price;
          double discountedPrice = price - discount;
                       
          // Step 2: Apply 6% sales tax on the discounted price
          double tax = 0.06 * discountedPrice;
          double totalPrice = discountedPrice + tax;
                       
          // Output: Display the final price to be paid by the customer
          System.out.printf("Original price: %.2f\n", price);
          System.out.printf("Discounted price (after 10%% discount): %.2f\n", discountedPrice);
          System.out.printf("Sales tax (6%% on discounted price): %.2f\n", tax);
          System.out.printf("Total amount to be paid by the customer: %.2f\n", totalPrice);
                       
          scanner.close();
     }
}                               