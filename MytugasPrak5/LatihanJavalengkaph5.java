package Test_test;

import java.util.Scanner;

public class LatihanJavalengkaph5 {
    
    // Soal 1: Program pengulangan dengan input 10 bilangan
    public static void soal1() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== SOAL 1 ===");
        System.out.println("Masukkan 10 bilangan:");
        
        int terbesar = Integer.MIN_VALUE;  // Nilai awal terkecil yang mungkin
        int terkecil = Integer.MAX_VALUE;  // Nilai awal terbesar yang mungkin
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int bilangan = input.nextInt();
            
            // Cek bilangan terbesar
            if (bilangan > terbesar) {
                terbesar = bilangan;
            }
            
            // Cek bilangan terkecil
            if (bilangan < terkecil) {
                terkecil = bilangan;
            }
        }
        
        System.out.println("\nHasil:");
        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
    
    // Soal 2: Program penjumlahan bilangan dengan input dinamis
    public static void soal2() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== SOAL 2 ===");
        System.out.print("Masukkan jumlah bilangan yang akan dijumlahkan: ");
        int n = input.nextInt();
        
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int bilangan = input.nextInt();
            total += bilangan;
        }
        
        double rataRata = (double) total / n; //karena ingin bilangan keluar desimal
        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
    
    // Soal 3: Floyd's Triangle
    public static void soal3() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== SOAL 3: Floyd's Triangle ===");
        System.out.print("Masukkan banyak baris: ");
        int baris = input.nextInt();
        
        int angka = 1;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
    
    // Soal 4: Menampilkan dan menjumlahkan angka ganjil
    public static void soal4() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== SOAL 4: Angka Ganjil ===");
        System.out.print("Masukkan banyak angka: ");
        int n = input.nextInt();
        
        int total = 0;
        System.out.print("Angka ganjil: ");
        for (int i = 1; i <= n * 2; i += 2) {
            System.out.print(i + " ");
            total += i;
        }
        System.out.println();
        System.out.println("Total penjumlahan: " + total);
    }
    
    // Soal 5: Triangle dan Diamond
    public static void soal5() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== SOAL 5: Triangle Patterns ===");
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        
        //Triangle
        System.out.println("\nTriangle:\n");
        for (int i = 1; i <= baris; i++) {
            // spasi
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            // bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //Diamond
        System.out.println("\nDiamond:\n");
        // bagean atas
         for (int i = 1; i <= baris; i++) {
            // spasi
            for (int s = 0; s < baris - i; s++) System.out.print(" ");
            // bintang
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        // bagean bawah
        for (int i = baris - 1; i >= 1; i--) {
            for (int s = 0; s < baris - i; s++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        
    }
    
    // Soal 6: Perulangan dengan bagian rumpang - menampilkan angka sebelas dua kali
    public static void soal6() {
        System.out.println("\n=== SOAL 6: Menampilkan Angka Sebelas Dua Kali ===");
        
        for (int i = 0; i < 10; i++) {
            // Bagian yang rumpang - untuk menampilkan angka 11 sebanyak 2 kali
            if (i == 1 || i == 6) { //11 || 11
                System.out.println(11);
            }
        }
    }
    
    // Soal 7: Perbedaan i++ dan ++i menggunakan while
    public static void soal7() {
        System.out.println("\n=== SOAL 7: Perbedaan i++ dan ++i ===");
        
        System.out.println("Menggunakan i++ (post-increment):");
        int i = 0;
        while (i < 5) {
            System.out.println("Nilai i: " + i);
            i++; // nilai i digunakan dulu, baru ditambah
        }
        
        System.out.println("\nMenggunakan ++i (pre-increment):");
        int j = 0;
        while (j < 5) {
            System.out.println("Nilai j: " + j);
            ++j; // nilai j ditambah dulu, baru digunakan
        }
        
        System.out.println("\nPerbedaan dalam ekspresi:");
        int a = 5;
        int b = a++; // b = 5, kemudian a = 6
        System.out.println("a++ : a = " + a + ", b = " + b);
        
        int c = 5;
        int d = ++c; // c = 6, kemudian d = 6
        System.out.println("++c : c = " + c + ", d = " + d);
    }
    
    // Soal 8: Foreach untuk menampilkan nilai array
    public static void soal8() {
        System.out.println("\n=== SOAL 8: Foreach Loop ===");
        
        int[] angka = {10, 20, 30, 40, 50};
        
        System.out.println("Menggunakan foreach:");
        for (int nilai : angka) {
            System.out.println("Nilai: " + nilai);
        }
        
        // Contoh jika pakai tipe data lain, string misal
        String[] nama = {"Ando", "Undo", "Odin", "Uno"};
        System.out.println("\nMenampilkan nama:");
        for (String n : nama) {
            System.out.println("Nama: " + n);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        
        while (running) { //karna true program berjalan
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║  LATIHAN PRAKTIKUM PERULANGAN - JAVA   ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Input 10 Bilangan");
            System.out.println("2. Penjumlahan Bilangan Dinamis");
            System.out.println("3. Floyd's Triangle");
            System.out.println("4. Angka Ganjil");
            System.out.println("5. Triangle Patterns");
            System.out.println("6. Perulangan Rumpang");
            System.out.println("7. Perbedaan i++ dan ++i");
            System.out.println("8. Foreach Loop");
            System.out.println("0. Keluar");
            System.out.print("\nPilih soal (0-8): ");
            
            int pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1: soal1(); break;
                case 2: soal2(); break;
                case 3: soal3(); break;
                case 4: soal4(); break;
                case 5: soal5(); break;
                case 6: soal6(); break;
                case 7: soal7(); break;
                case 8: soal8(); break;
                case 0: 
                    System.out.println("Terima kasih!");
                    running = false; //boolean false atau program berhenti disini
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        
        input.close();
    }
}
