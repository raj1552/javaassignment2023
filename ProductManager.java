import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
        initProducts();
    }

    private void initProducts() {
        products.add(new Product(1,"Topi", 1, 50));
        products.add(new Product(2,"Khukuri", 1, 100));
        products.add(new Product(3,"Nanglo", 1, 250));
        products.add(new Product(4,"Thangka", 1, 150));
        products.add(new Product(5,"Shawl", 1, 200));
        products.add(new Product(6,"Doko", 1, 300));
        products.add(new Product(7,"Carpet", 1, 350));
        products.add(new Product(8,"Gundri", 1, 400));
        products.add(new Product(9,"Bowls", 1, 500));
        products.add(new Product(10,"Sarangi", 1, 450));
    }

    public List<Product> getProducts() {
        return products;
    }
}

