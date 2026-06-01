import java.util.ArrayList;

public class Order {

    private String orderNumber;
    private String customerName;
    private ArrayList<OrderItem> items;

    public Order(String orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        items = new ArrayList<>();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public static class OrderItem {

        private String productName;
        private double unitPrice;
        private int quantity;

        public OrderItem(String productName, double unitPrice, int quantity) {
            this.productName = productName;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        double total() {
            return unitPrice * quantity;
        }

    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.total();
        }
        return sum;
    }

}
