import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        char repeat;
        Scanner sc = new Scanner(System.in);

        products.add(new Product("product 1", 1, 50));
        products.add(new Product("product 2", 1, 100));
        products.add(new Product("product 3", 1, 250));
        products.add(new Product("product 4", 1, 150));
        products.add(new Product("product 5", 1, 200));
        products.add(new Product("product 6", 1, 300));
        products.add(new Product("product 7", 1, 350));
        products.add(new Product("product 8", 1, 400));
        products.add(new Product("product 9", 1, 500));
        products.add(new Product("product 10", 1, 450));

        do {
            System.out.println("Product name" + "\t" + "Price" + "\n");

            for (Product product : products) {
                System.out.println(product.getproductname() + "\t" + product.getprice());
            }
            int i;
            for (i = 0; i < 5; i++) {
                Order order = new Order();

                System.out.println("Enter product name");
                boolean productfound = false;
                String itemname = sc.nextLine();

                for (Product product : products) {
                    if (product.getproductname().equalsIgnoreCase(itemname)) {
                        productfound = true;
                        System.out.println("Enter quantity");
                        int quantity = sc.nextInt();
                        sc.nextLine();
                        order.additems(product, quantity);
                    }
                }

                if (!productfound) {
                    System.out.println("Product not found");
                    System.out.println("Do you want to continue? (y/n)");
                    String response = sc.nextLine();
                    if (!response.equalsIgnoreCase("y")) {
                        break;
                    }
                } else {
                    System.out.println("Total calculation: " + order.getcalulation());
                    System.out.println("Charity contribution: " + order.forcharitycontribution());
                    System.out.println("Final bill: " + order.finalbill());
                }
            }
            System.out.println("Do you want to repeat again? (Y/N)");
            repeat = sc.nextLine().charAt(0);
        } while (Character.toUpperCase(repeat) == 'Y' || Character.toUpperCase(repeat) == 'y');
    }
}
