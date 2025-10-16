import java.util.Scanner;

public class StoreTester {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Create default and parameterized examples
Grocery apple = new Grocery("Apple", 0.99, 50, "2025-11-10");
Electronics laptop = new Electronics("Laptop", 899.99, 10, 24);


// Print out initial inventory
System.out.println("Initial Supermarket Inventory:");
System.out.println(apple);
System.out.println(laptop);


// EXTRA CREDIT: Allow user to modify product stock
System.out.print("\nEnter new stock for " + apple.getName() + ": ");
int newStock = input.nextInt();
apple.setStock(newStock);

System.out.println("\nUpdated Product:");
System.out.println(apple);

input.close();
}
}
