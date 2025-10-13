package MultiLevelInheritence_Problems;
class Order {
 String orderId;
 String orderDate;

 public Order(String orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 public void getOrderStatus() {
     System.out.println("Order Status: Order placed");
 }
}
class ShippedOrder extends Order {
 String trackingNumber;

 public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 @Override
 public void getOrderStatus() {
     super.getOrderStatus(); 
     System.out.println("Order Status: Shipped (Tracking Number: " + trackingNumber + ")");
 }
}
class DeliveredOrder extends ShippedOrder {
 String deliveryDate;
 public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }
 @Override
 public void getOrderStatus() {
     super.getOrderStatus(); 
     System.out.println("Order Status: Delivered on " + deliveryDate);
 }
}
public class RetailSystem {
 public static void main(String[] args) {
     DeliveredOrder order = new DeliveredOrder(
             "ORD123",
             "2025-09-10",
             "TRK56789",
             "2025-09-14"
     );
     order.getOrderStatus();
 }
}

