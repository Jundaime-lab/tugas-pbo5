package Test_test;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatihanJavaLengkap2 {
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║   LATIHAN PRAKTIKUM INPUT & OUTPUT     ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Penghitungan Gaji Pegawai");
            System.out.println("2. Penghitungan Belanja dengan Diskon");
            System.out.println("3. Perbedaan Scanner dan BufferedReader");
            System.out.println("4. Penghitungan Gaya Sentripetal");
            System.out.println("5. Belanja Buah Ibu Sisca");
            System.out.println("6. Selisih Waktu");
            System.out.println("7. Percetakan Novel");
            System.out.println("0. Keluar");
            System.out.println("════════════════════════════════════════");
            System.out.print("Pilih nomor soal (0-7): ");
            pilihan = input.nextInt();
            input.nextLine();
            
            System.out.println();
            
            if (pilihan == 1) {
                soal1_HitungGaji();
            } else if (pilihan == 2) {
                soal2_HitungBelanja();
            } else if (pilihan == 3) {
                soal3_PerbedaanInput();
            } else if (pilihan == 4) {
                soal4_GayaSentripetal();
            } else if (pilihan == 5) {
                soal5_BelanjaIbuSisca();
            } else if (pilihan == 6) {
                soal6_SelisihWaktu();
            } else if (pilihan == 7) {
                soal7_PercetakanNovel();
            } else if (pilihan == 0) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
            
            if (pilihan != 0) {
                System.out.println("\nTekan Enter untuk kembali ke menu...");
                new Scanner(System.in).nextLine();
            }
            
        } while (pilihan != 0);
    }
    
    public static void soal1_HitungGaji() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║    SOAL 1: PENGHITUNGAN GAJI PEGAWAI   ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        // Input data
        System.out.print("Nomor Induk Karyawan : ");
        String nik = input.nextLine();
        
        System.out.print("Nama Karyawan        : ");
        String nama = input.nextLine();
        
        System.out.print("Alamat               : ");
        String alamat = input.nextLine();
        
        System.out.print("Jabatan              : ");
        String jabatan = input.nextLine();
        
        System.out.print("Gaji Pokok (P1)      : ");
        int gajiPokok = input.nextInt();
        
        System.out.print("Tunjangan Jabatan (P2): ");
        int tunjanganJabatan = input.nextInt();
        
        System.out.print("Tunjangan Istri (P3) : ");
        int tunjanganIstri = input.nextInt();
        
        System.out.print("Tunjangan Anak (P4)  : ");
        int tunjanganAnak = input.nextInt();
        
        // Hitung total gaji
        int totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
        
        // Hitung pajak (10% dari P1+P2+P3)
        double pajak = 0.10 * (gajiPokok + tunjanganJabatan + tunjanganIstri);
        
        // Hitung gaji bersih
        double gajiBersih = totalGaji - pajak;
        
        System.out.println("\n" + "═".repeat(50));
        System.out.println("               SLIP GAJI PEGAWAI");
        System.out.println("═".repeat(50));
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("─".repeat(50));
        System.out.println("Gaji Pokok (P1)      : Rp " + gajiPokok);
        System.out.println("Tunjangan Jabatan (P2): Rp " + tunjanganJabatan);
        System.out.println("Tunjangan Istri (P3) : Rp " + tunjanganIstri);
        System.out.println("Tunjangan Anak (P4)  : Rp " + tunjanganAnak);
        System.out.println("─".repeat(50));
        System.out.println("Total Gaji           : Rp " + totalGaji);
        System.out.println("Pajak (10%)          : Rp " + pajak);
        System.out.println("═".repeat(50));
        System.out.println("GAJI BERSIH          : Rp " + gajiBersih);
        System.out.println("═".repeat(50));
    }
    
    public static void soal2_HitungBelanja() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   SOAL 2: BELANJA DENGAN DISKON        ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        System.out.print("Nama Pembeli   : ");
        String nama = input.nextLine();
        
        System.out.print("Total Belanja  : Rp ");
        double totalBelanja = input.nextDouble();
        
        // Hitung diskon
        double diskon = 0; //Nilai default di set ke 0
        double persenDiskon = 0;
        
        if (totalBelanja > 100000) {
            persenDiskon = 10;
            diskon = totalBelanja * 10 / 100;
        } else if (totalBelanja > 50000) {
            persenDiskon = 5;
            diskon = totalBelanja * 5 / 100;
        }
        
        // Hitung total bayar
        double total = totalBelanja - diskon;
        
        // Input bayar
        System.out.print("Bayar          : Rp ");
        double bayar = input.nextDouble();
        double kembalian = bayar - total;
        
        // Output
        System.out.println("\n" + "═".repeat(50));
        System.out.println("              STRUK PEMBAYARAN");
        System.out.println("═".repeat(50));
        System.out.println("Nama             : " + nama);
        System.out.println("Total Belanja    : Rp " + totalBelanja);
        System.out.println("Diskon (" + persenDiskon + "%)     : Rp " + diskon);
        System.out.println("─".repeat(50));
        System.out.println("Total            : Rp " + total);
        System.out.println("Bayar            : Rp " + bayar);
        System.out.println("Kembalian        : Rp " + kembalian);
        System.out.println("═".repeat(50));
    }
    
    // ═══════════════════════════════════════════════════════════
    // SOAL 3: PERBEDAAN SCANNER DAN BUFFEREDREADER
    // ═══════════════════════════════════════════════════════════
    public static void soal3_PerbedaanInput() throws IOException {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║  SOAL 3: SCANNER VS BUFFEREDREADER     ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        System.out.println("\n=== PERBEDAAN UTAMA ===\n");
        
        System.out.println("SCANNER:");
        System.out.println("• Lebih mudah digunakan");
        System.out.println("• Ada method untuk berbagai tipe data:");
        System.out.println("  - nextInt(), nextDouble(), nextLine(), dll");
        System.out.println("• Tidak perlu throws IOException");
        System.out.println("• Cocok untuk input sederhana");
        System.out.println("• Contoh: Scanner sc = new Scanner(System.in);");
        
        System.out.println("\nBUFFEREDREADER:");
        System.out.println("• Lebih cepat dan efisien untuk data besar");
        System.out.println("• Hanya bisa baca String (readLine())");
        System.out.println("• Harus manual parsing untuk tipe lain:");
        System.out.println("  - Integer.parseInt(br.readLine())");
        System.out.println("  - Double.parseDouble(br.readLine())");
        System.out.println("• Memerlukan throws IOException");
        System.out.println("• Cocok untuk membaca file dan input besar");
        System.out.println("• Contoh: BufferedReader br = new BufferedReader(");
        System.out.println("          new InputStreamReader(System.in));");
        
        System.out.println("\n" + "─".repeat(50));
        System.out.println("CONTOH PENGGUNAAN:");
        System.out.println("─".repeat(50));
        
        // Demo/percobaan Scanner
        System.out.println("\n[DEMO SCANNER]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama1 = sc.nextLine();
        System.out.print("Masukkan umur: ");
        int umur1 = sc.nextInt();
        System.out.println("→ Hasil: " + nama1 + ", " + umur1 + " tahun");
        
        // Demo/percobaan BufferedReader
        System.out.println("\n[DEMO BUFFEREDREADER]");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan kota: ");
        String kota = br.readLine();
        System.out.print("Masukkan kode pos: ");
        int kodePos = Integer.parseInt(br.readLine());
        System.out.println("→ Hasil: " + kota + ", " + kodePos);
    }
    
    // ═══════════════════════════════════════════════════════════
    // SOAL 4: PENGHITUNGAN GAYA SENTRIPETAL
    // ═══════════════════════════════════════════════════════════
    public static void soal4_GayaSentripetal() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   SOAL 4: GAYA SENTRIPETAL (Fc)        ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Rumus: Fc = (m × v²) / r");
        System.out.println();
        
        System.out.print("Masukkan massa (m) dalam kg       : ");
        double massa = input.nextDouble();
        
        System.out.print("Masukkan kecepatan (v) dalam m/s  : ");
        double kecepatan = input.nextDouble();
        
        System.out.print("Masukkan jari-jari (r) dalam m    : ");
        double jariJari = input.nextDouble();
        
        // Hitung gaya sentripetal: Fc = (m × v²) / r
        double kecepatanKuadrat = kecepatan * kecepatan;
        double gayaSentripetal = (massa * kecepatanKuadrat) / jariJari;
        
        System.out.println("\n" + "═".repeat(50));
        System.out.println("           HASIL PERHITUNGAN");
        System.out.println("═".repeat(50));
        System.out.println("Massa (m)          : " + massa + " kg");
        System.out.println("Kecepatan (v)      : " + kecepatan + " m/s");
        System.out.println("Jari-jari (r)      : " + jariJari + " m");
        System.out.println("─".repeat(50));
        System.out.println("v²                 : " + kecepatanKuadrat + " m²/s²");
        System.out.println("═".repeat(50));
        System.out.println("GAYA SENTRIPETAL   : " + gayaSentripetal + " Newton");
        System.out.println("═".repeat(50));
    }
    
    // ═══════════════════════════════════════════════════════════
    // SOAL 5: BELANJA BUAH IBU SISCA
    // ═══════════════════════════════════════════════════════════
    public static void soal5_BelanjaIbuSisca() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   SOAL 5: BELANJA BUAH IBU SISCA       ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        // Harga per buah
        int hargaMangga = 70; // per pcs
        int hargaJambu = 30;
        
        System.out.println("Harga buah mangga: Rp " + hargaMangga + "/pcs");
        System.out.println("Harga buah jambu : Rp " + hargaJambu + "/pcs");
        System.out.println();
        
        // In pembelian mangga
        System.out.print("Jumlah buah mangga (pcs): ");
        int jumlahMangga = input.nextInt();
        
        // In beri jambu untuk 4 tetangga
        System.out.println("\nBuah jambu untuk tetangga:");
        System.out.print("  Tetangga 1 (pcs): ");
        int jambu1 = input.nextInt();
        
        System.out.print("  Tetangga 2 (pcs): ");
        int jambu2 = input.nextInt();
        
        System.out.print("  Tetangga 3 (pcs): ");
        int jambu3 = input.nextInt();
        
        System.out.print("  Tetangga 4 (pcs): ");
        int jambu4 = input.nextInt();
        
        // Total jambu
        int totalJambu = jambu1 + jambu2 + jambu3 + jambu4;
        
        // Mangga yang busuk
        int manggaBusuk = 15;
        int manggaBagus = jumlahMangga - manggaBusuk;
        
        // Hitung total biaya
        int biayaMangga = jumlahMangga * hargaMangga;
        int biayaJambu = totalJambu * hargaJambu;
        int totalBiaya = biayaMangga + biayaJambu;
        
        System.out.println("\n" + "═".repeat(50));
        System.out.println("           DETAIL BELANJA IBU SISCA");
        System.out.println("═".repeat(50));
        
        System.out.println("\n[BUAH MANGGA]");
        System.out.println("Jumlah dibeli      : " + jumlahMangga + " pcs × Rp " + hargaMangga);
        System.out.println("Total biaya        : Rp " + biayaMangga);
        System.out.println("Mangga busuk       : " + manggaBusuk + " pcs (dikembalikan)");
        System.out.println("Mangga bagus       : " + manggaBagus + " pcs");
        
        System.out.println("\n[BUAH JAMBU]");
        System.out.println("Tetangga 1         : " + jambu1 + " pcs");
        System.out.println("Tetangga 2         : " + jambu2 + " pcs");
        System.out.println("Tetangga 3         : " + jambu3 + " pcs");
        System.out.println("Tetangga 4         : " + jambu4 + " pcs");
        System.out.println("─".repeat(50));
        System.out.println("Total jambu        : " + totalJambu + " pcs × Rp " + hargaJambu);
        System.out.println("Total biaya        : Rp " + biayaJambu);
        
        System.out.println("\n" + "═".repeat(50));
        System.out.println("TOTAL PEMBAYARAN   : Rp " + totalBiaya);
        System.out.println("═".repeat(50));
    }
    
    // ═══════════════════════════════════════════════════════════
    // SOAL 6: SELISIH WAKTU
    // ═══════════════════════════════════════════════════════════
    public static void soal6_SelisihWaktu() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      SOAL 6: SELISIH WAKTU             ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        System.out.println("\n[WAKTU PERTAMA]");
        System.out.print("Jam   : ");
        int jam1 = input.nextInt();
        System.out.print("Menit : ");
        int menit1 = input.nextInt();
        System.out.print("Detik : ");
        int detik1 = input.nextInt();
        
        System.out.println("\n[WAKTU KEDUA]");
        System.out.print("Jam   : ");
        int jam2 = input.nextInt();
        System.out.print("Menit : ");
        int menit2 = input.nextInt();
        System.out.print("Detik : ");
        int detik2 = input.nextInt();
        
        // Konversi ke detik
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;
        
        // Hitung selisih
        int selisihDetik = totalDetik2 - totalDetik1;
        if (selisihDetik < 0) {
            selisihDetik = selisihDetik * -1;
        }
        
        // Konversi kembali ke jam, menit, detik
        int jamSelisih = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menitSelisih = sisaDetik / 60;
        int detikSelisih = sisaDetik % 60;
        
        System.out.println("\n" + "═".repeat(50));
        System.out.println("              HASIL PERHITUNGAN");
        System.out.println("═".repeat(50));
        System.out.println("Waktu Pertama  : " + jam1 + ":" + menit1 + ":" + detik1 + " = " + totalDetik1 + " detik");
        System.out.println("Waktu Kedua    : " + jam2 + ":" + menit2 + ":" + detik2 + " = " + totalDetik2 + " detik");
        System.out.println("═".repeat(50));
        System.out.println("SELISIH WAKTU  : " + jamSelisih + " jam " + menitSelisih + " menit " + detikSelisih + " detik");
        System.out.println("TOTAL DETIK    : " + selisihDetik + " detik");
        System.out.println("═".repeat(50));
    }
    
    // ═══════════════════════════════════════════════════════════
    // SOAL 7: PERCETAKAN NOVEL
    // ═══════════════════════════════════════════════════════════
    public static void soal7_PercetakanNovel() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     SOAL 7: PERCETAKAN NOVEL           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Kecepatan: 1 lembar/detik");
        System.out.println();
        
        // Kecepatan cetak
        int lembarPerDetik = 1; // 1 lembar/dtk

        System.out.print("Jumlah novel yang dicetak    : ");
        int jumlahNovel = input.nextInt();
        
        System.out.print("Jumlah lembar per novel      : ");
        int lembarPerNovel = input.nextInt();
        
        // Hitung total lembar
        int totalLembar = jumlahNovel * lembarPerNovel;
        
        // Hitung waktu per detik
        int totalDetik = totalLembar * lembarPerDetik;
        
        // Konversi ke hari, jam, menit, detik
        int hari = totalDetik / 86400; // 1 hari = 86400 detik
        int sisaDetik = totalDetik % 86400;
        
        int jam = sisaDetik / 3600; // 1 jam = 3600 detik
        sisaDetik = sisaDetik % 3600;
        
        int menit = sisaDetik / 60; // 1 menit = 60 detik
        int detik = sisaDetik % 60;
        
        System.out.println("\n" + "═".repeat(50));
        System.out.println("           HASIL PERHITUNGAN");
        System.out.println("═".repeat(50));
        System.out.println("Jumlah novel       : " + jumlahNovel + " buah");
        System.out.println("Lembar per novel   : " + lembarPerNovel + " lembar");
        System.out.println("Total lembar       : " + totalLembar + " lembar");
        System.out.println("Kecepatan cetak    : " + lembarPerDetik + " lembar/detik");
        System.out.println("═".repeat(50));
        System.out.println("WAKTU YANG DIPERLUKAN:");
        System.out.println("  " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
        System.out.println("  (Total: " + totalDetik + " detik)");
        System.out.println("═".repeat(50));
        
        System.out.println("\n[REFERENSI KONVERSI WAKTU]");
        System.out.println("1 menit = 60 detik");
        System.out.println("1 jam   = 3600 detik = 60 menit");
        System.out.println("1 hari  = 86400 detik = 1440 menit = 24 jam");
    }
}