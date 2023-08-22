class Product {
    private int productId;
    private String productname;
    private int Quantity;
    private double price;

    public Product(int productId, String productname, int Quantity, double price) {
        this.productId = productId;
        this.productname = productname;
        this.Quantity = Quantity;
        this.price = price;
    }

    public int getproductid() {
        return productId;
    }

    public String getproductname() {
        return productname;
    }

    public int getquantity() {
        return Quantity;
    }

    public double getprice() {
        return price;
    }

    public void setquantity(int Quantity) {
        this.Quantity = Quantity;
    }
}