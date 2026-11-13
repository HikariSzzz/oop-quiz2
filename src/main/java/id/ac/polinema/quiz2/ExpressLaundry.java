package id.ac.polinema.quiz2;

public class ExpressLaundry extends LaundryOrder implements Deliverable {

    public ExpressLaundry(String orderId, Customer customer, double weightKg) {
        super(orderId, customer, weightKg);
    }

    @Override
    public double calculatePrice() {
        // Aturan: harga = berat x Rp 9.000 per kg
        return getWeightKg() * 9000.0;
    }

    @Override
    public double deliveryFee() {
        // Biaya tetap Rp 5.000
        return 5000.0;
    }
}