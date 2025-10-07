// Functional interface
@FunctionalInterface
interface PaymentProcessor {
    void process(double amount); // single abstract method
}

// Main interface with default and static methods
interface PaymentService {
    // Default method
    default void welcomeMessage() {
        System.out.println("Welcome to the Payment Service!");
    }

    // Static method
    static void serviceInfo() {
        System.out.println("Payment Service Version 1.0");
    }
}

// Class implementing the interface
class OnlinePayment implements PaymentService {
    PaymentProcessor creditCardPayment = amount -> 
        System.out.println("Processing credit card payment of $" + amount);

    PaymentProcessor paypalPayment = amount -> 
        System.out.println("Processing PayPal payment of $" + amount);
}

public class PaymentSystemDemo {
    public static void main(String[] args) {
        PaymentService.serviceInfo();

        OnlinePayment payment = new OnlinePayment();

        payment.welcomeMessage();

        // Use functional interface with lambda
        payment.creditCardPayment.process(100.50);
        payment.paypalPayment.process(250.75);
    }
}
