import java.util.HashMap;
import java.util.Map;

public class Konser {
    private String namaKonser;
    private String tanggal;
    private String lokasi;
    private Map<String, Double> jenisTiket;

    public Konser() {
        // Inisialisasi nilai detail konser
        this.namaKonser = "Konser JKT48 Flowerfull 12th Anniversary";
        this.tanggal = "18/12/2023";
        this.lokasi = "Graha Unesa, Surabaya";
        this.jenisTiket = new HashMap<>();
        initializeJenisTiket();
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getLokasi() {
        return lokasi;
    }

    private void initializeJenisTiket() {
        // Menambahkan jenis tiket dan harga
        jenisTiket.put("VIP", 1300000.0);
        jenisTiket.put("Regular", 800000.0);
        jenisTiket.put("Student", 500000.0);
    }

    public Map<String, Double> getJenisTiket() {
        return jenisTiket;
    }
}
