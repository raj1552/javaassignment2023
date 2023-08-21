import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
        initProducts();
    }

    private void initProducts() {
        products.add(new Product("Topi", 1, 50));
        products.add(new Product("Khukuri", 1, 100));
        products.add(new Product("Nanglo", 1, 250));
        products.add(new Product("Thangka", 1, 150));
        products.add(new Product("Shawl", 1, 200));
        products.add(new Product("Doko", 1, 300));
        products.add(new Product("Carpet", 1, 350));
        products.add(new Product("Gundri", 1, 400));
        products.add(new Product("Bowls", 1, 500));
        products.add(new Product("Sarangi", 1, 450));
    }

    public List<Product> getProducts() {
        return products;
    }
}

