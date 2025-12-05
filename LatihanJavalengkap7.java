package Test_test;

import java.util.Scanner;

class Faktorial {
    int hitung(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) hasil *= i;
        return hasil;
    }
}

class Pangkat {
    int pow(int a, int b) {
        int hasil = 1;
        for (int i = 0; i < b; i++) hasil *= a;
        return hasil;
    }

    double pow(double a, double b) {
        return Math.pow(a, b);
    }
}

class Biner {
    String convert(int n) {
        return Integer.toBinaryString(n);
    }
}

class Kasir {

    double harga;
    int jumlah;
    double diskon;

    Kasir(double harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    Kasir(double harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    Kasir(double harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    double total() {
        double total = harga * jumlah;
        double potongan = total * (diskon / 100);
        return total - potongan;
    }
}

class PersegiPanjang {
    int panjang, lebar;

    PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    int luas() {
        return panjang * lebar;
    }
}

class HitungBidang {
    int hitungArea(PersegiPanjang luar, PersegiPanjang dalam) {
        return luar.luas() - dalam.luas();
    }
}

class Nilai {
    int[] data;

    Nilai(int[] data) {
        this.data = data;
    }

    double rataRata() {
        double total = 0;
        for (int n : data) total += n;
        return total / data.length;
    }
}

class Hitung {
    Nilai proses(Nilai n) {
        return n; 
    }
}

class Deret {
    void tampil(int[] data) {
        for (int n : data) System.out.print(n + " ");
        System.out.println();
    }
}

public class LatihanJavalengkap7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU PROGRAM OOP ===");
            System.out.println("1. Faktorial");
            System.out.println("2. Pangkat");
            System.out.println("3. Konversi Bilangan ke Biner");
            System.out.println("4. Program Kasir (Overloading Constructor)");
            System.out.println("5. Luas Bidang Hitam (Objek sebagai Parameter)");
            System.out.println("6. Hitung Rata-rata (Objek sebagai Nilai Kembali)");
            System.out.println("7. Tampilkan Deret (Pass by Reference)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    
                    System.out.print("Masukkan angka: ");
                    Faktorial f = new Faktorial();
                    System.out.println("Hasil faktorial: " + f.hitung(sc.nextInt()));
                    break;

                case 2:
                    
                    Pangkat p = new Pangkat();
                    System.out.print("Masukkan bilangan: ");
                    int a = sc.nextInt();
                    System.out.print("Masukkan pangkat: ");
                    int b = sc.nextInt();
                    System.out.println("Hasil pangkat = " + p.pow(a, b));
                    break;

                case 3:
                    
                    Biner bn = new Biner();
                    System.out.print("Masukkan bilangan: ");
                    System.out.println("Biner: " + bn.convert(sc.nextInt()));
                    break;

                case 4:
                    
                    System.out.println("1) Hanya harga");
                    System.out.println("2) Harga + jumlah");
                    System.out.println("3) Harga + jumlah + diskon");
                    System.out.print("Pilih jenis input: ");
                    int j = sc.nextInt();

                    if (j == 1) {
                        System.out.print("Harga: ");
                        Kasir k1 = new Kasir(sc.nextDouble());
                        System.out.println("Total: " + k1.total());
                    } else if (j == 2) {
                        System.out.print("Harga: ");
                        double h = sc.nextDouble();
                        System.out.print("Jumlah: ");
                        int jm = sc.nextInt();
                        Kasir k2 = new Kasir(h, jm);
                        System.out.println("Total: " + k2.total());
                    } else {
                        System.out.print("Harga: ");
                        double h = sc.nextDouble();
                        System.out.print("Jumlah: ");
                        int jm = sc.nextInt();
                        System.out.print("Diskon (%): ");
                        double d = sc.nextDouble();
                        Kasir k3 = new Kasir(h, jm, d);
                        System.out.println("Total: " + k3.total());
                    }
                    break;

                case 5:
                    
                    PersegiPanjang luar = new PersegiPanjang(10, 8);
                    PersegiPanjang dalam = new PersegiPanjang(5, 4);
                    HitungBidang hb = new HitungBidang();
                    System.out.println("Luas bidang hitam = " + hb.hitungArea(luar, dalam));
                    break;

                case 6:
                    
                    int[] arr = {80, 90, 75, 95};
                    Nilai nilai = new Nilai(arr);
                    Hitung h = new Hitung();
                    Nilai hasil = h.proses(nilai);
                    System.out.println("Rata-rata = " + hasil.rataRata());
                    break;

                case 7:
                    
                    int[] deret = {6, 12, 24, 48, 96};
                    Deret d = new Deret();
                    d.tampil(deret);
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}