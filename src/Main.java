import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek konser dengan nilai detail konser
        Konser konser = new Konser();

        // Menampilkan detail konser
        System.out.println("Detail Konser");
        System.out.println("Nama Konser: " + konser.getNamaKonser());
        System.out.println("Tanggal: " + konser.getTanggal());
        System.out.println("Lokasi: " + konser.getLokasi());

        // Menampilkan jenis tiket dan harganya
        System.out.println("\nJenis Tiket dan Harga");
        Map<String, Double> jenisTiket = konser.getJenisTiket();
        for (Map.Entry<String, Double> entry : jenisTiket.entrySet()) {
            System.out.println(entry.getKey() + ": Rp" + entry.getValue());
        }

        System.out.print("\nMasukkan nama pengguna: ");
        String namaPembeli = scanner.nextLine();

        System.out.print("Masukkan email pengguna: ");
        String emailPembeli = scanner.nextLine();

        // Meminta jenis tiket yang ingin dibeli
        System.out.print("Masukkan jenis tiket yang ingin dibeli: ");
        String jenisTiketPilihan = scanner.nextLine();

        // Membuat objek pengguna
        Pembeli pembeli = new Pembeli(namaPembeli, emailPembeli);

        // Meminta informasi pemesanan dari pengguna
        System.out.print("Masukkan jumlah tiket yang akan dipesan: ");
        int jumlahTiket = scanner.nextInt();

        Pemesanan pemesanan = new Pemesanan(new Date(), jumlahTiket);

        // Pengguna memesan tiket
        pemesanan.pesanTiket(pembeli, konser, jenisTiketPilihan);
    }
}
