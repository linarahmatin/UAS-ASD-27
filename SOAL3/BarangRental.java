package SOAL3;

public class BarangRental {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;

    public BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }
}

class TransaksiRental {
    String namaPeminjam;
    int lamaPinjam;
    BarangRental barangRental;
    boolean member;

    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental barangRental, boolean member) {
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.barangRental = barangRental;
        this.member = member;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public BarangRental getBarangRental() {
        return barangRental;
    }

    public boolean isMember() {
        return member;
    }

    public int hitungBiayaTotal() {
        int biayaTotal = barangRental.getBiayaSewa() * lamaPinjam;
        if (member) {
            biayaTotal -= 25000; 
            if (lamaPinjam >= 48 && lamaPinjam <= 78) {
                biayaTotal -= 0.1 * biayaTotal; 
            } else if (lamaPinjam > 78) {
                biayaTotal -= 0.2 * biayaTotal; 
            }
        }
        return biayaTotal;
    }
}


