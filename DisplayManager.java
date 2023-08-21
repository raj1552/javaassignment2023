import java.util.List;

public class DisplayManager {
    public static void displayProducts(List<Product> products) {
        System.out.println("\n\nWelcome to Handicraft Happiness");
        System.out.println("------------------------------- \n");
        System.out.println("Product name" + "\t" + "Price" + "\n");

        for (Product product : products) {
            System.out.println(product.getproductname() + "\t\t" + product.getprice());
        }
    }
}
