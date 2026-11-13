package id.ac.polinema.quiz2;

/**
 * TAHAP 1 (pemanasan): pelanggan yang membuat pesanan.
 */
public class Customer {

    // 1. Deklarasikan field private sesuai diagram
    private String customerId;
    private String name;

    /**
     * Menyimpan kedua parameter ke field.
     */
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    /**
     * Mengubah nama. Nama yang null atau kosong (hanya spasi) tidak valid:
     * abaikan dan biarkan nama lama tetap.
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
}