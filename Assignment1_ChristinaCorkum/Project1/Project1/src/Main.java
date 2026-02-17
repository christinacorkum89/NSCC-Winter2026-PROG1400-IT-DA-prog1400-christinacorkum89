//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class FreeShippingCalculator {
    static void main() {
        System.out.println("Welcome to the Online Store Shipping Calculator!");
        System.out.println("==============================================");

        // Declare order amount
        double orderAmount = 65.99;

        // Shipping threshold
        double freeShippingThreshold = 50.00;

        // Calculate if eligible for free shipping

        // Display order details
        System.out.println("Order Amount: $" + orderAmount);
        System.out.println("Free Shipping Threshold: $" + freeShippingThreshold);
        System.out.println();

        // Display shipping status
        System.out.println("✅ Congratulations! Your order qualifies for FREE shipping!");
        System.out.println("Total to pay: $" + orderAmount);

        System.out.println("==============================================");
        System.out.println("Thank you for shopping with us!");
    }
}