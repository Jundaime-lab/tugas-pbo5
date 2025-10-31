package Test_test;

import java.util.Scanner;

//PraktikumStrukturKontrol
public class LatihanJavaLengkap3 {

    static Scanner input = new Scanner(System.in);

    static void soal1() {
        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " adalah bilangan genap.");
        else
            System.out.println(n + " adalah bilangan ganjil.");
    }

    static void soal2() {
        System.out.print("Masukkan kode hari (1-7): ");
        int kode = input.nextInt();

        String hari = switch (kode) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jumat";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "Kode tidak valid!";
        };

        System.out.println("Hari: " + hari);
    }

    static void soal3() {
        System.out.print("Masukkan NIK: ");
        String nik = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int gol = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int anak = input.nextInt();

        double gajiPokok = switch (gol) {
            case 1 -> 1200000;
            case 2 -> 1500000;
            case 3 -> 1750000;
            case 4 -> 2000000;
            default -> 0;
        };

        double tunjPasangan = 0.10 * gajiPokok;
        double tunjAnak = 0.05 * gajiPokok * anak;
        double gajiBersih = gajiPokok + tunjPasangan + tunjAnak;

        System.out.println("\n=== Data Gaji Karyawan ===");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Golongan: " + gol);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjAnak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }

    static void soal4() {
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        boolean kabisat = (tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0);
        if (kabisat)
            System.out.println(tahun + " adalah tahun kabisat.");
        else
            System.out.println(tahun + " bukan tahun kabisat.");
    }

    static void soal5() {
        System.out.print("Masukkan total penjualan: ");
        double penjualan = input.nextDouble();
        double pendapatan;

        if (penjualan <= 2000000)
            pendapatan = 100000 + (0.10 * penjualan);
        else if (penjualan <= 5000000)
            pendapatan = 200000 + (0.15 * penjualan);
        else
            pendapatan = 300000 + (0.20 * penjualan);

        System.out.println("Pendapatan Salesman: Rp" + pendapatan);
    }

    static void soal6() {
        System.out.print("Apakah memiliki kartu member? (true/false): ");
        boolean member = input.nextBoolean();
        System.out.print("Masukkan total belanja: ");
        double totalBelanja = input.nextDouble();
        System.out.print("Masukkan uang dibayar: ");
        double uangBayar = input.nextDouble();

        double diskon = 0;
        if (member) {
            if (totalBelanja > 500000)
                diskon = 50000;
            else if (totalBelanja > 100000)
                diskon = 15000;
        } else {
            if (totalBelanja > 100000)
                diskon = 10000;
        }

        double totalBayar = totalBelanja - diskon;
        double kembalian = uangBayar - totalBayar;

        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + totalBayar);
        System.out.println("Kembalian: Rp" + kembalian);
    }

    static void soal7() {
        System.out.println("""
                Pilih Bangun Datar:
                1. Persegi
                2. Segitiga
                3. Lingkaran
                4. Trapesium
                5. Layang-layang
                """);
        System.out.print("Masukkan pilihan: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1 -> {
                System.out.print("Sisi: ");
                double s = input.nextDouble();
                System.out.println("Luas Persegi = " + (s * s));
            }
            case 2 -> {
                System.out.print("Alas: ");
                double a = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas Segitiga = " + (0.5 * a * t));
            }
            case 3 -> {
                System.out.print("Jari-jari: ");
                double r = input.nextDouble();
                System.out.println("Luas Lingkaran = " + (3.14 * r * r));
            }
            case 4 -> {
                System.out.print("Sisi atas: ");
                double a = input.nextDouble();
                System.out.print("Sisi bawah: ");
                double b = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas Trapesium = " + ((a + b) / 2 * t));
            }
            case 5 -> {
                System.out.print("Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.println("Luas Layang-layang = " + (0.5 * d1 * d2));
            }
            default -> System.out.println("Pilihan tidak valid!");
        }
    }

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("""
                ========== MENU PRAKTIKUM STRUKTUR KONTROL ==========
                1. Cek Bilangan Genap/Ganjil
                2. Kode Hari
                3. Gaji Karyawan
                4. Tahun Kabisat
                5. Pendapatan Salesman
                6. Program Kasir
                7. Luas Bangun Datar
                0. Keluar
                ================================================
                """);
            System.out.print("Pilih program: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1 -> soal1();
                case 2 -> soal2();
                case 3 -> soal3();
                case 4 -> soal4();
                case 5 -> soal5();
                case 6 -> soal6();
                case 7 -> soal7();
                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        } while (pilih != 0);
    }
}
