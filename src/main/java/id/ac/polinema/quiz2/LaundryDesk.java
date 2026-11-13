package id.ac.polinema.quiz2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TAHAP 4 dan 5 (collections dan SOLID): meja laundry yang menyimpan
 * dan memproses pesanan laundry.
 */
public class LaundryDesk {

    private ReceiptPrinter printer;
    
    private List<LaundryOrder> orderList;
    private Map<String, LaundryOrder> orderMap;
    
    /**
     * Membuat meja laundry kosong dan menyimpan pencetak struk yang diberikan.
     */
    public LaundryDesk(ReceiptPrinter printer) {
        this.printer = printer;
        this.orderList = new ArrayList<>();
        this.orderMap = new HashMap<>();
    }

    /**
     * Menyimpan pesanan laundry ke daftar dan ke Map
     */
    public void add(LaundryOrder order) {
        orderList.add(order);
        orderMap.put(order.getOrderId(), order);
    }

    /**
     * Mencari pesanan laundry lewat kode.
     */
    public LaundryOrder findById(String orderId) {
        return orderMap.get(orderId);
    }

    /**
     * @return jumlah pesanan laundry yang tersimpan
     */
    public int count() {
        return orderList.size();
    }

    /**
     * @return daftar pesanan laundry menurut urutan penambahan
     */
}