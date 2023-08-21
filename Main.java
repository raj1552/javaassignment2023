import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> products = productManager.getProducts();
        char repeat;
        Scanner sc = new Scanner(System.in);

        do {
            //Called the static function DisplayManager
            DisplayManager.displayProducts(products);
            //Called the static Function OrderManager
            OrderManager.takeOrders(products);
            //Ask the user if they want to use the system again
            System.out.println("Do you want to repeat again? (Y/N)");
            repeat = sc.nextLine().charAt(0);
        } while (Character.toUpperCase(repeat) == 'Y' || Character.toUpperCase(repeat) == 'y');
    }
}
