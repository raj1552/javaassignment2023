import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> products = productManager.getProducts();

            //Called the static function DisplayManager
            DisplayManager.displayProducts(products);
            //Called the static Function OrderManager
            OrderManager.takeOrders(products);
    }
}
