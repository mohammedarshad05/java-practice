enum OrderStatus {
    PLACED,
    SHIPPED,
    OUTFORDELELIVERY,
    DELIVERED,
    CANCELLED
}
                    
    
class Order {
    private String orderId;
    private OrderStatus status;

    public Order(String orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;

    }

    public void displayStatus() {
        System.out.println("order ID: " + this.orderId + ",status: " + this.status);

    }
}
    

public class EnumDemo {

    public static void main(String[] args) {
        Order order1 = new Order("ORD110022", OrderStatus.PLACED);
        System.out.println("initial order Status: ");
        order1.displayStatus();

        order1.updateStatus(OrderStatus.SHIPPED);
        System.out.println("\n Updated the status");
        order1.displayStatus();

        order1.updateStatus(OrderStatus.OUTFORDELELIVERY);
        System.out.println(" \nyour order out status");
        order1.displayStatus();


        order1.updateStatus(OrderStatus.DELIVERED);
        System.out.println("\nyour order has been delievered status");
        order1.displayStatus();
    }
}


    

