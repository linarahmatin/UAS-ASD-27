
class BarangRental{
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;

    public BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa ) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }
}

class TransaksiRental {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental barangRental;

    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental barangRental) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.barangRental = barangRental;
        this.totalBiaya = lamaPinjam * barangRental.getBiayaSewa();
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRental getBarangRental() {
        return barangRental;
    }
}

