    class Product {
        private String productname;
        private int Quantity;
        private double price;

        public Product(String productname, int Quantity, double price) {
            this.productname = productname;
            this.Quantity = Quantity;
            this.price = price;
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