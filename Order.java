import java.util.ArrayList;
import java.util.List;

class Order {
    private List<OrderItem> items; // Change the type to List<OrderItem>

    public Order() {
        items = new ArrayList<>();
    }

    public void additems(Product product, int Quantity) {
        OrderItem orderItem = new OrderItem(product, Quantity);
        items.add(orderItem); // Add the orderItem to the list
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getcalulation() {
        double total = 0;
        for (OrderItem orderItem : items) {
            total += orderItem.getProduct().getprice() * orderItem.getQuantity();
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