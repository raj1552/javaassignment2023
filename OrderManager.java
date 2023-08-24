
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OrderManager {
    public static void takeOrders(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {

            Order order = new Order();
            System.out.println("\n");
            String name;

            // Keep asking for customer name until a non-empty name is entered
            do {
                System.out.println("Enter Customer name ");
                name = sc.nextLine();

                // Check if the entered name contains only numeric characters
                if (name.matches("\\d+")) {
                    System.out.println("Please enter a valid name, not a number.");
                    name = ""; // Reset the name so that the loop continues
                }
            } while (name.isEmpty());

            boolean addMoreProducts = true;

            while (addMoreProducts) {
                System.out.println("Enter product Id");
                boolean productFound = false;
                int itemid = sc.nextInt();
                sc.nextLine();

                for (Product product : products) {
                    // Check if the entered product id matches the current product in the loop
                    if (product.getproductid() == itemid) {
                        productFound = true;

                        int quantity = -1;
                        while (quantity <= 0) {
                            System.out.println("\nEnter quantity");
                            if (sc.hasNextInt()) {
                                quantity = sc.nextInt();
                                if (quantity <= 0) {
                                    System.out.println("Please enter a valid quantity greater than 0.");
                                }
                            } else {
                                System.out.println("Invalid input. Please enter a numeric value for quantity.");
                                sc.next(); // Consume the invalid input
                            }
                        }

                        sc.nextLine(); // Consume the newline character
                        order.additems(product, quantity);
                        break; // Exit the loop since product is found
                    }
                }

                // If the product isn't found it shows product not found
                if (!productFound) {
                    System.out.println("Product not found");
                }

                System.out.println("Do you want to add more products? (Y/N)");
                String addMore = sc.nextLine().toUpperCase();
                addMoreProducts = (addMore.charAt(0) == 'Y');
            }

            System.out.println("\t\t\t\t\t" + "Handicraft Happiness");
            System.out.println("\t\t\t\t\t" + "_______________________\n\n");
            System.out.println("\t\t\t\t\t" + "BILL");
            System.out.println("\t\t\t\t\t" + "------\n");
            System.out.println("\t\t\t" + "Name" + "\t\t\t" + "Quantity" + "\t\t\t" + "Total\n");
            for (OrderItem orderItem : order.getItems()) {
                Product product = orderItem.getProduct();
                int quantity = orderItem.getQuantity();
                double total = product.getprice() * quantity;
                System.out.println(
                        "\t\t\t" + product.getproductname() + "\t\t\t" + quantity + "\t\t\t\t" + total + "\n\n\n");
            }

            // Print the order details and bill
            System.out.println("\t\t\t" + "Customer Name" + "\t\t\t\t\t" + name);
            System.out.println("\t\t\t" + "For Store" + "\t\t\t\t\t" + order.finalbill());
            System.out.println("\t\t\t" + "Charity contribution " + "\t\t\t\t" + order.forcharitycontribution());
            System.out.println("\t\t\t" + "Total Bill" + "\t\t\t\t\t" + order.getcalulation() + "\n\n");
            System.out.println("Do you want to repeat again? (Y/N)");
            again = sc.nextLine().charAt(0);
        } while (Character.toUpperCase(again) == 'Y');
        System.out.println("Thankyou for visting");
    }
}
