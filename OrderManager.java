import java.util.List;
import java.util.Scanner;

public class OrderManager {
    public static void takeOrders(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        char again;

          do{  Order order = new Order();
            System.out.println("\n");
            System.out.println("Enter Customer name ");
            String name=sc.nextLine();
            System.out.println("Enter product name");
            boolean productFound = false;
            String itemName = sc.nextLine();

            // Iterate through the list of products to find a match for the entered item name
            for (Product product : products) {
                  // Check if the entered product name matches the current product in the loop
                if (product.getproductname().equalsIgnoreCase(itemName)) {
                    productFound = true;
                    System.out.println("\nEnter quantity");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    order.additems(product, quantity);
                }
            }

            //If the product isn't found it shows product not found
            if (!productFound) {
                System.out.println("Product not found");
            } else {
                System.out.println("\t\t\t\t\t" + "Handicraft Happiness");
                System.out.println("\t\t\t\t\t"+"_______________________\n");
                System.out.println("\t\t\t"+"Customer Name"+"\t\t\t\t\t"+name);
                System.out.println("\t\t\t"+"Product Name" +"\t\t\t\t\t"+ itemName);
                System.out.println("\t\t\t"+"Total calculation" + "\t\t\t\t"+order.getcalulation());
                System.out.println("\t\t\t"+"Charity contribution " + "\t\t\t\t"+order.forcharitycontribution());
                System.out.println("\t\t\t"+"Final bill"+ "\t\t\t\t\t" + order.finalbill());
            }
            System.out.println("Do you want to repeat again? (Y/N)");
            again = sc.nextLine().charAt(0);
        }while(Character.toUpperCase(again)=='Y'|| Character.toUpperCase(again)=='y');
    }
}
