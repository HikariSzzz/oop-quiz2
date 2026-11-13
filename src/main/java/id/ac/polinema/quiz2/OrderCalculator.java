package id.ac.polinema.quiz2;

import java.util.List;

/**
 * TAHAP 3 (polimorfisme dan exception): perhitungan atas banyak pesanan laundry.
 */
public class OrderCalculator {

    public static double totalPrice(List<LaundryOrder> orders) {
        double total = 0.0;
        for (LaundryOrder order : orders) {
            total += order.calculatePrice(); 
        }
        return total;
    }

    public static double totalDelivery(List<LaundryOrder> orders) {
        double totalFee = 0.0;
        for (LaundryOrder order : orders) {
            if (order instanceof Deliverable) {
                Deliverable d = (Deliverable) order;
                totalFee += d.deliveryFee();
            }
        }
        return totalFee;
    }
    
    public static void validate(LaundryOrder order) throws InvalidWeightException {
        double weight = order.getWeightKg();
        if (weight <= 0 || weight > 20) {
            throw new InvalidWeightException("Invalid weight: " + weight);
        }
    }

    public static boolean isAcceptable(LaundryOrder order) {
        try {
            validate(order);
            return true; 
        } catch (InvalidWeightException e) {
            return false;
        }
    }
}