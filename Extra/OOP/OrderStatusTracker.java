import java.util.Scanner;

public class OrderStatusTracker {

    // Enum declared inside the class
    enum OrderStatus {
        PLACED,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter order status (PLACED, SHIPPED, DELIVERED, CANCELLED):");
        String input = scanner.next().toUpperCase();

        try {
            OrderStatus status = OrderStatus.valueOf(input);

            System.out.println("Current Status: " + status);

            switch (status) {
                case PLACED:
                    System.out.println("Your order has been placed successfully.");
                    break;
                case SHIPPED:
                    System.out.println("Your order is on the way.");
                    break;
                case DELIVERED:
                    System.out.println("Your order has been delivered.");
                    break;
                case CANCELLED:
                    System.out.println("Your order was cancelled.");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid status. Please enter a valid order status.");
        }
    }
}
