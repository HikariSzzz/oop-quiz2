package id.ac.polinema.quiz2;

public class RegularLaundry extends LaundryOrder {

    public RegularLaundry(String orderId, Customer customer, double weightKg) {
        super(orderId, customer, weightKg);
    }

    @Override
    public double calculatePrice() {
        // Aturan: harga = berat x Rp 6.000 per kg
        return getWeightKg() * 6000.0;
    }
}