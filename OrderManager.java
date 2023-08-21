import java.util.List;
import java.util.Scanner;

public class OrderManager {
    public static void takeOrders(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            Order order = new Order();
            System.out.println("\n");
            System.out.println("Customer " + i);
            System.out.println("-----------");
            System.out.println("Enter product name");
            boolean productFound = false;
            String itemName = scanner.nextLine();

            // Iterate through the list of products to find a match for the entered item name
            for (Product product : products) {
                  // Check if the entered product name matches the current product in the loop
                if (product.getproductname().equalsIgnoreCase(itemName)) {
                    productFound = true;
                    System.out.println("\nEnter quantity");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    order.additems(product, quantity);
                }
            }

            //If the product isn't found it shows product not found
            if (!productFound) {
                System.out.println("Product not found");
            } else {
                System.out.println("Product Name: " + itemName);
                System.out.println("Total calculation: " + order.getcalulation());
                System.out.println("Charity contribution: " + order.forcharitycontribution());
                System.out.println("Final bill: " + order.finalbill());
            }
        }
    }
}
