import java.util.Date;

public class Pemesanan {
    private Date tanggalPemesanan;
    private int jumlahTiket;
    private double totalHarga;

    public Pemesanan(Date tanggalPemesanan, int jumlahTiket) {
        this.tanggalPemesanan = tanggalPemesanan;
        this.jumlahTiket = jumlahTiket;
        this.totalHarga = totalHarga;
    }

    public void pesanTiket(Pembeli Pembeli, Konser konser, String jenisTiketPilihan) {
        // Mendapatkan harga tiket berdasarkan jenis tiket
        double hargaTiket = konser.getJenisTiket().get(jenisTiketPilihan);

        // Melakukan perhitungan total harga
        totalHarga = jumlahTiket * hargaTiket;

        // Implementasi logika pemesanan tiket
        System.out.println("\nTiket berhasil dipesan!\n");

        // Menampilkan informasi pesanan
        System.out.println("Detail Pemesanan:");
        System.out.println("Nama Pembeli: " + Pembeli.getNamaPembeli());
        System.out.println("Email Pengguna: " + Pembeli.getEmail());
        System.out.println("Jenis Tiket: " + jenisTiketPilihan);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Total Harga: Rp" + totalHarga);
    }

}
