package Test_test;

import java.util.Scanner;

// ========== SOAL 1 ==========
class Mobil {
    String merk;
    String warna;
    int tahun;
}

// ========== SOAL 2 ==========
class PersegiPanjang {
    double panjang;
    double lebar;
    
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

// ========== SOAL 3 ==========
class TebakTanggalLahir {
    int hitungTrik(int bulan, int tanggal) {
        return ((bulan * 5) + 6) * 4 + tanggal + 166;
    }
}

// ========== SOAL 4 ==========
class SumpahPemuda {
    String kalimat1;
    String kalimat2;
    String kalimat3;
    
    SumpahPemuda() {
        kalimat1 = "Kami putra dan putri Indonesia";
        kalimat2 = "mengaku berbangsa yang satu, bangsa Indonesia";
        kalimat3 = "menjunjung bahasa persatuan, bahasa Indonesia";
    }
    
    void tampilkan() {
        System.out.println(kalimat1);
        System.out.println(kalimat2);
        System.out.println(kalimat3);
    }
}

// ========== SOAL 5 ==========
class Rekursif {
    int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }
    
    int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// ========== SOAL 6 ==========
class Civitas {
    String nama;
    String alamat;
    String noTelepon;
}

class Dosen extends Civitas {
    String nip;
    String mataKuliah;
}

class Mahasiswa extends Civitas {
    String npm;
    String jurusan;
    String angkatan;
}

class Staff extends Civitas {
    String nip;
    String bagian;
}

// ========== SOAL 7 ==========
class MahasiswaData {
    String nama;
    String npm;
    String kelas;
    
    void inputData(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    void tampilkanData() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

// ========== MAIN CLASS DENGAN MENU ==========
public class LatihanJavaLengkap6 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihan;
        
        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-8): ");
            pilihan = input.nextInt();
            input.nextLine(); // consume newline
            
            System.out.println();
            
            switch(pilihan) {
                case 1:
                    soal1();
                    break;
                case 2:
                    soal2();
                    break;
                case 3:
                    soal3();
                    break;
                case 4:
                    soal4();
                    break;
                case 5:
                    soal5();
                    break;
                case 6:
                    soal6();
                    break;
                case 7:
                    soal7();
                    break;
                case 8:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            if (pilihan != 8) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                input.nextLine();
            }
            
        } while(pilihan != 8);
        
        input.close();
    }
    
    static void tampilkanMenu() {
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║    LATIHAN PRAKTIKUM KELAS DAN OBJEK - JAVA OOP   ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  1. Soal 1 - Kelas dan Objek (Mobil)              ║");
        System.out.println("║  2. Soal 2 - Method (Keliling Persegi Panjang)    ║");
        System.out.println("║  3. Soal 3 - Method Berparameter (Trik Tanggal)   ║");
        System.out.println("║  4. Soal 4 - Konstruktor (Sumpah Pemuda)          ║");
        System.out.println("║  5. Soal 5 - Rekursif (Faktorial & Fibonacci)     ║");
        System.out.println("║  6. Soal 6 - Civitas Akademika (Inheritance)      ║");
        System.out.println("║  7. Soal 7 - Keyword THIS (Input Data Mahasiswa)  ║");
        System.out.println("║  8. Keluar                                         ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }
    
    static void soal1() {
        System.out.println("========== SOAL 1: KELAS DAN OBJEK ==========");
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Merah";
        mobil1.tahun = 2023;
        
        System.out.println("Membuat objek dari kelas Mobil:");
        System.out.println("Merk  : " + mobil1.merk);
        System.out.println("Warna : " + mobil1.warna);
        System.out.println("Tahun : " + mobil1.tahun);
    }
    
    static void soal2() {
        System.out.println("========== SOAL 2: METHOD ==========");
        PersegiPanjang pp = new PersegiPanjang();
        
        System.out.print("Masukkan panjang: ");
        pp.panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        pp.lebar = input.nextDouble();
        
        System.out.println("\nHasil:");
        System.out.println("Panjang : " + pp.panjang);
        System.out.println("Lebar   : " + pp.lebar);
        System.out.println("Keliling: " + pp.hitungKeliling());
    }
    
    static void soal3() {
        System.out.println("========== SOAL 3: METHOD BERPARAMETER ==========");
        System.out.println("Program Trik Menebak Tanggal Lahir");
        
        TebakTanggalLahir trik = new TebakTanggalLahir();
        
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = input.nextInt();
        
        int hasil = trik.hitungTrik(bulan, tanggal);
        System.out.println("\nHasil trik: " + hasil);
        System.out.println("(Contoh: 14 Januari = 114)");
    }
    
    static void soal4() {
        System.out.println("========== SOAL 4: KONSTRUKTOR ==========");
        System.out.println("Menampilkan Sumpah Pemuda:");
        System.out.println();
        
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkan();
    }
    
    static void soal5() {
        System.out.println("========== SOAL 5: REKURSIF ==========");
        Rekursif r = new Rekursif();
        
        System.out.print("Masukkan angka untuk faktorial: ");
        int n = input.nextInt();
        System.out.println("Faktorial " + n + " = " + r.faktorial(n));
        
        System.out.print("\nMasukkan jumlah deret Fibonacci: ");
        int jumlah = input.nextInt();
        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(r.fibonacci(i) + " ");
        }
        System.out.println();
    }
    
    static void soal6() {
        System.out.println("========== SOAL 6: CIVITAS AKADEMIKA ==========");
        
        Dosen dosen1 = new Dosen();
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.alamat = "Jl. Sudirman No. 10";
        dosen1.noTelepon = "081234567890";
        dosen1.nip = "197001012000031001";
        dosen1.mataKuliah = "Pemrograman Java";
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Andi Wijaya";
        mhs1.alamat = "Jl. Merdeka No. 20";
        mhs1.noTelepon = "082345678901";
        mhs1.npm = "2023001";
        mhs1.jurusan = "Teknik Informatika";
        mhs1.angkatan = "2023";
        
        Staff staff1 = new Staff();
        staff1.nama = "Siti Nurhaliza";
        staff1.alamat = "Jl. Gatot Subroto No. 15";
        staff1.noTelepon = "083456789012";
        staff1.nip = "198005052005032002";
        staff1.bagian = "Administrasi Akademik";
        
        System.out.println("═══ DATA DOSEN ═══");
        System.out.println("Nama        : " + dosen1.nama);
        System.out.println("NIP         : " + dosen1.nip);
        System.out.println("Mata Kuliah : " + dosen1.mataKuliah);
        System.out.println("Alamat      : " + dosen1.alamat);
        
        System.out.println("\n═══ DATA MAHASISWA ═══");
        System.out.println("Nama     : " + mhs1.nama);
        System.out.println("NPM      : " + mhs1.npm);
        System.out.println("Jurusan  : " + mhs1.jurusan);
        System.out.println("Angkatan : " + mhs1.angkatan);
        
        System.out.println("\n═══ DATA STAFF ═══");
        System.out.println("Nama   : " + staff1.nama);
        System.out.println("NIP    : " + staff1.nip);
        System.out.println("Bagian : " + staff1.bagian);
        
        System.out.println("\n→ Hubungan: Dosen, Mahasiswa, dan Staff");
        System.out.println("  adalah bagian dari Civitas Akademika Fakultas Teknik");
    }
    
    static void soal7() {
        System.out.println("========== SOAL 7: KEYWORD THIS ==========");
        System.out.println("Program Input Data Mahasiswa\n");
        
        MahasiswaData mhs = new MahasiswaData();
        
        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();
        
        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();
        
        mhs.inputData(nama, npm, kelas);
        
        System.out.println("\n═══ DATA YANG DIINPUT ═══");
        mhs.tampilkanData();
        System.out.println("\n→ Menggunakan keyword 'this' untuk membedakan");
        System.out.println("  parameter dan atribut class");
    }
}