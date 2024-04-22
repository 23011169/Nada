package e.commerce.system;

public class Order2 {
    private int customerId;
    private int orderId;
    private Product2[] products;
    private float totalPrice;

    public Order2(int customerId, int orderId, Product2[] products , float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = totalPrice;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }

    public Product2[] getproducts() {
        return products;
    }

    public void setproducts(Product2[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Here's your order's summary:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (Product2 product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice()); 
        }
         System.out.println("Total price: $" + totalPrice);
        
    }
}