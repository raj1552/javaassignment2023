import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Product> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void additems(Product product, int Quantity) {
         product.setquantity(Quantity);
        items.add(product);
    }

    public double getcalulation() {
        double total = 0;
        for (Product product : items) {
            total += product.getquantity() * product.getprice(); ;
        }
        return total;
    }

    public double forcharitycontribution() {
        double totalbill = getcalulation();
        return totalbill * 0.12;
    }

    public double finalbill() {
        double totalbill = getcalulation();
        double forcharity = forcharitycontribution();
        return totalbill - forcharity;
    }
}