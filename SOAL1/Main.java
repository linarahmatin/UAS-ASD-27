public class Main {
    
    public static void main(String[] args) {
        BarangRental barang1 = new BarangRental("B1234", "Toyota Avanza", "Mobil", 2019, 200000);
        BarangRental barang2 = new BarangRental("M5678", "Honda Beat", "Motor", 2020, 100000);

        TransaksiRental transaksi1 = new TransaksiRental("John Doe", 3, barang1);
        TransaksiRental transaksi2 = new TransaksiRental("Jane Smith", 2, barang2);

        System.out.println("Kode Transaksi: " + transaksi1.getKodeTransaksi());
        System.out.println("Nama Peminjam: " + transaksi1.getNamaPeminjam());
        System.out.println("Lama Pinjam: " + transaksi1.getLamaPinjam() + " hari");
        System.out.println("Total Biaya: Rp" + transaksi1.getTotalBiaya());
        System.out.println("Barang Rental: " + transaksi1.getBarangRental().getNamaKendaraan());

        System.out.println();

        System.out.println("Kode Transaksi: " + transaksi2.getKodeTransaksi());
        System.out.println("Nama Peminjam: " + transaksi2.getNamaPeminjam());
        System.out.println("Lama Pinjam: " + transaksi2.getLamaPinjam() + " hari");
        System.out.println("Total Biaya: Rp" + transaksi2.getTotalBiaya());
        System.out.println("Barang Rental: " + transaksi2.getBarangRental().getNamaKendaraan());
    }
}

