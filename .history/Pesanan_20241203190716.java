import java.util.ArrayList;

public class Pesanan {
    private ArrayList<MenuItem> itemPesanan;

    public Pesanan() {
        this.itemPesanan = new ArrayList<>();
    }
    public void tambahItem(MenuItem item) {
        itemPesanan.add(item);
    }
    public double hitungTotal() {
        double total = 0;
        for (MenuItem item : itemPesanan) {
            if (item instanceof Diskon) {
                total -= total * (((Diskon) item).getDiskon() / 100);
            } else {
                total += item.getHarga();
            }
        }
        return total;
    }
    public void tampilkanStruk() {
        System.out.println(x:"Struk Pesanan:");
        for (MenuItem item : itemPesanan) {
            System.out.println(item.getNama() + " - " + item.getHarga());
        }
        System.out.println("Total: " + hitungTotal());
    }
}
