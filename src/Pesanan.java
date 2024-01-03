import java.util.Date;

public class Pesanan extends Pemesanan {
    public Pesanan(Date tanggalPemesanan, int jumlahTiket) {
        super(tanggalPemesanan, jumlahTiket);
    }

    // Override method pesanTiket untuk menampilkan informasi pesanan

    public void pesanTiket(Pembeli Pembeli, Konser konser, String jenisTiketPilihan) {
        // Mendapatkan harga tiket berdasarkan jenis tiket
        double hargaTiket = konser.getJenisTiket().get(jenisTiketPilihan);

        // Melakukan perhitungan total harga
        totalHarga = jumlahTiket * hargaTiket;

        // Implementasi logika pemesanan tiket
        System.out.println("\nTiket berhasil dipesan!\n");

        // Menampilkan informasi pesanan
        System.out.println("Detail Pesanan:");
        System.out.println("Nama Pembeli: " + Pembeli.getNamaPembeli());
        System.out.println("Email Pengguna: " + Pembeli.getEmail());
        System.out.println("Jenis Tiket: " + jenisTiketPilihan);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Total Harga: Rp" + totalHarga);
    }
}
