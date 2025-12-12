package Test_test;

import java.util.*; //import semua class yang ada di package java.util, pastinya seperti util scanner,arraylist, dan lainnya

// ==========================
// SOAL 1: Pewarisan Hewan
// ==========================
class Hewan {
    public void jenis() {
        System.out.println("Macam-macam hewan:");
        System.out.println("- hewan berkaki dua");
        System.out.println("- hewan berkaki enam");
        System.out.println("- hewan berkaki empat");
        System.out.println("- hewan berkaki delapan");
    }
}

class HewanBerkakiDua extends Hewan {
    public void contoh() {
        System.out.println("- hewan berkaki dua: kangguru, ayam, bebek, dll");
    }
}

class HewanBerkakiEnam extends Hewan {
    public void contoh() {
        System.out.println("- hewan berkaki enam: capung, nyamuk, kupu-kupu, dll");
    }
}

class HewanBerkakiEmpat extends Hewan {
    public void contoh() {
        System.out.println("- hewan berkaki empat: kucing, anjing, kuda, dll");
    }
}

class HewanBerkakiDelapan extends Hewan {
    public void contoh() {
        System.out.println("- hewan berkaki delapan: kepiting, belalang, laba-laba, dll");
    }
}


// ===============================
// SOAL 2: Luas Segitiga (protected)
// ===============================
class Segitiga {
    protected double alas, tinggi;

    public Segitiga(double a, double t) {
        alas = a;
        tinggi = t;
    }

    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

// ===============================
// SOAL 3: Volume Kubus (private & public)
// ===============================
class Kubus {
    private double sisi;

    public Kubus(double s) {
        sisi = s;
    }

    private double volume() {
        return sisi * sisi * sisi;
    }

    public double getVolume() {
        return volume();
    }
}


// ===============================
// SOAL 4: Kelas Hewan dan Kucing
// ===============================
class Hewan2 {
    String nama;

    public Hewan2(String n) {
        nama = n;
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing extends Hewan2 {

    public Kucing(String n) {
        super(n);
    }

    String display() {
        return "Nama kucing: " + nama;
    }
}


// ===============================
// SOAL 5 & 6: Produk, Komik, Games
// ===============================
class Produk {
    String judul;
    String penulis;

    public Produk(String j, String p) {
        judul = j;
        penulis = p;
    }

    public String getInfoProduk() {
        return "Judul: " + judul + "\nPenulis: " + penulis;
    }
}

class Komik extends Produk {
    int jumlahHalaman;

    public Komik(String j, String p, int h) {
        super(j, p);
        jumlahHalaman = h;
    }

    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() +
                "\nJumlah Halaman: " + jumlahHalaman;
    }
}

class Games extends Produk {
    int waktuMain;

    public Games(String j, String p, int w) {
        super(j, p);
        waktuMain = w;
    }

    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() +
                "\nWaktu Main: " + waktuMain + " jam";
    }
}


// ===============================
// MAIN
// ===============================
public class LatihanJavalengkap8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n====== MENU OOP ======");
            System.out.println("1. Hewan (Subclass & Superclass)");
            System.out.println("2. Hitung luas segitiga (protected)");
            System.out.println("3. Hitung volume kubus (private & public)");
            System.out.println("4. Kelas Hewan & Kucing");
            System.out.println("5. Produk -> Komik & Games");
            System.out.println("6. EXIT");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    Hewan h = new Hewan();
                    h.jenis();

                    new HewanBerkakiDua().contoh();
                    new HewanBerkakiEnam().contoh();
                    new HewanBerkakiEmpat().contoh();
                    new HewanBerkakiDelapan().contoh();
                    break;

                case 2:
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextDouble();

                    Segitiga s = new Segitiga(a, t);
                    System.out.println("Luas segitiga: " + s.hitungLuas());
                    break;

                case 3:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisi = sc.nextDouble();

                    Kubus kb = new Kubus(sisi);
                    System.out.println("Volume kubus: " + kb.getVolume());
                    break;

                case 4:
                    System.out.print("Masukkan nama hewan (kucing): ");
                    String nama = sc.nextLine();

                    Kucing k = new Kucing(nama);
                    k.makan();
                    System.out.println(k.display());
                    break;

                case 5:
                    System.out.println("--- Data Komik ---");
                    System.out.print("Judul: ");
                    String j1 = sc.nextLine();
                    System.out.print("Penulis: ");
                    String p1 = sc.nextLine();
                    System.out.print("Jumlah halaman: ");
                    int h1 = sc.nextInt();

                    Komik komik = new Komik(j1, p1, h1);

                    sc.nextLine();
                    System.out.println("\n--- Data Game ---");
                    System.out.print("Judul: ");
                    String j2 = sc.nextLine();
                    System.out.print("Penulis: ");
                    String p2 = sc.nextLine();
                    System.out.print("Waktu main (jam): ");
                    int w2 = sc.nextInt();

                    Games game = new Games(j2, p2, w2);

                    System.out.println("\nOUTPUT KOMIK:");
                    System.out.println(komik.getInfoProduk());

                    System.out.println("\nOUTPUT GAME:");
                    System.out.println(game.getInfoProduk());
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 6);

        sc.close();
    }
}
