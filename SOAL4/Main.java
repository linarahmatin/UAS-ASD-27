package SOAL4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     private static List<BarangRental> daftarKendaraan = new ArrayList<>();
    private static List<TransaksiRental> daftarTransaksi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeDaftarKendaraan();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarKendaraan();
                    break;
                case 2:
                    peminjamanKendaraan();
                    break;
                case 3:
                    tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    System.out.println("Fitur belum diimplementasikan");
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi rental kendaraan!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void initializeDaftarKendaraan() {
        daftarKendaraan.add(new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 25000));
        daftarKendaraan.add(new BarangRental("IN 4511 VS", "Honda Vario", "Motor", 2019, 25000));
        daftarKendaraan.add(new BarangRental("IN 1453 AA", "Toyota Yaris", "Mobil", 2018, 40000));
        daftarKendaraan.add(new BarangRental("AB 4321 A", "Toyota Innova", "Mobil", 2021, 40000));
        daftarKendaraan.add(new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2022, 40000));
    }

    private static void tampilkanDaftarKendaraan() {
        System.out.println("Daftar Kendaraan Rental Serba Serbi");
        System.out.println("Nomor TNKB\tNama Kendaraan\tJenis\tTahun\tBiaya Sewa Perjam");
        for (BarangRental kendaraan : daftarKendaraan) {
            System.out.printf("%s\t%s\t%s\t%d\t%d%n", kendaraan.getNoTNKB(), kendaraan.getNamaKendaraan(), kendaraan.getJenisKendaraan(), kendaraan.getTahun(), kendaraan.getBiayaSewa());
        }
    }

    private static void peminjamanKendaraan() {
       
    }

    private static void tampilkanSeluruhTransaksi() {
        System.out.println("Daftar Transaksi Peminjaman Rental Serba Serbi");
        System.out.println("No\tNo TNKB\tNama Kendaraan\tNama Peminjam\tLama Pinjam\tTotal Biaya");

        int totalPendapatan = 0;
        for (int i = 0; i < daftarTransaksi.size(); i++) {
            TransaksiRental transaksi = daftarTransaksi.get(i);
            totalPendapatan += transaksi.hitungBiayaTotal();

            System.out.printf("%d\t%s\t%s\t%s\t%d\t%d%n", (i + 1), transaksi.getBarangRental().getNoTNKB(),
                    transaksi.getBarangRental().getNamaKendaraan(), transaksi.getNamaPeminjam(),
                    transaksi.getLamaPinjam(), transaksi.hitungBiayaTotal());
        }

        System.out.println("Semua transaksi berhasil dicetak");
        System.out.println("TOTAL PENDAPATAN RENTAL SERBA SERBI");
        System.out.println("Pendapatan hari ini: " + totalPendapatan);
    }
}

