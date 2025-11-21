// MAIN PROGRAM
package Test_test;

public class LatihanJavaLengkap5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        while (true) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("MENU LATIHAN ARRAY & MULTITHREADING");
            System.out.println("=".repeat(50));
            System.out.println("1. Soal 1 - Tiga Variasi Array");
            System.out.println("2. Soal 2 - Mengubah Nilai Array");
            System.out.println("3. Soal 3 - Operasi Array Lengkap");
            System.out.println("4. Soal 4 - Nilai Mahasiswa");
            System.out.println("5. Soal 5 - Penjumlahan Matriks");
            System.out.println("6. Soal 6 - Rata-rata Kelompok");
            System.out.println("7. Soal 7 - Thread dengan Extends");
            System.out.println("8. Soal 8 - Thread Utama & Anak");
            System.out.println("9. Soal 9 - Dua Macam Perulangan");
            System.out.println("10. Soal 10 - Mixed Data Type");
            System.out.println("0. Keluar");
            System.out.println("=".repeat(50));
            System.out.print("Pilih nomor soal (0-10): ");
            
            int pilihan = sc.nextInt();
            sc.nextLine(); 
            
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    Soal1.jalankan();
                    break;
                case 2:
                    Soal2.jalankan();
                    break;
                case 3:
                    Soal3.jalankan();
                    break;
                case 4:
                    Soal4.jalankan();
                    break;
                case 5:
                    Soal5.jalankan();
                    break;
                case 6:
                    Soal6.jalankan();
                    break;
                case 7:
                    Soal7.jalankan();
                    break;
                case 8:
                    Soal8.jalankan();
                    break;
                case 9:
                    Soal9.jalankan();
                    break;
                case 10:
                    Soal10.jalankan();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            System.out.print("\nTekan Enter untuk kembali ke menu...");
            sc.nextLine();
        }
    }
}

//Array bertipe data integer
class Soal1 {
    public static void jalankan() {
        System.out.println("=== SOAL 1: TIGA VARIASI ARRAY ===\n");
        
        // Tiga variasi
        
        // Variasi 1: Deklarasi dengan ukuran
        int[] array1 = new int[5];
        array1[0] = 10;
        array1[1] = 20;
        
        // Variasi 2: Deklarasi dengan inisialisasi langsung
        int[] array2 = {1, 2, 3, 4, 5};
        
        // Variasi 3: Deklarasi terpisah dengan inisialisasi
        int[] array3;
        array3 = new int[]{10, 20, 30, 40, 50};
        
        System.out.println("Variasi 1 - Deklarasi dengan ukuran:");
        System.out.println("  Array 1 length: " + array1.length);
        System.out.println("  Array 1: " + java.util.Arrays.toString(array1));
        
        System.out.println("\nVariasi 2 - Inisialisasi langsung:");
        System.out.println("  Array 2: " + java.util.Arrays.toString(array2));
        
        System.out.println("\nVariasi 3 - Deklarasi terpisah:");
        System.out.println("  Array 3: " + java.util.Arrays.toString(array3));
    }
}

//Mengubah nilai array pada indeks tertentu
class Soal2 {
    public static void jalankan() {
        System.out.println("=== SOAL 2: MENGUBAH NILAI ARRAY ===\n");
        
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        
        System.out.println("Array awal: " + java.util.Arrays.toString(mobil));
        
        // Mengubah nilai pada indeks yang berisi "Suzuki" (indeks 1)
        System.out.println("\nMengubah 'Suzuki' menjadi 'Toyota'...");
        mobil[1] = "Toyota";
        
        System.out.println("\nArray setelah diubah: " + java.util.Arrays.toString(mobil));
        System.out.println("Nilai indeks 1 sekarang: " + mobil[1]);
    }
}

//Membangkitkan variabel array dengan berbagai aturan
class Soal3 {
    public static void jalankan() {
        System.out.println("=== SOAL 3: OPERASI ARRAY LENGKAP ===\n");
        
        // a. Masukkan jumlah elemen array satu dimensi
        int[] numbers = {10, 25, 30, 15, 40, 5, 35, 20};
        
        // b. Memasukkan nilai elemen sesuai jumlah elemen
        System.out.println("Jumlah elemen: " + numbers.length);
        System.out.println("Semua elemen: " + java.util.Arrays.toString(numbers));
        
        // c. Tampilkan nilai terbesar dan terkecil serta posisi dari indeks
        int max = numbers[0], min = numbers[0];
        int maxIndex = 0, minIndex = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        
        System.out.println("\nNilai terbesar: " + max + " pada indeks " + maxIndex);
        System.out.println("Nilai terkecil: " + min + " pada indeks " + minIndex);
        
        // d. Jumlahkan semua data dan cari rata-rata
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        System.out.println("\nJumlah total: " + sum);
        System.out.println("Rata-rata: " + avg);
        
        // e. Jumlahkan elemen berindeks ganjil (NPM genap)
        int sumGanjil = 0;
        System.out.print("\nElemen indeks ganjil: ");
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
            sumGanjil += numbers[i];
        }
        System.out.println("\nJumlah elemen indeks ganjil: " + sumGanjil);
        
        // f. Jumlahkan elemen berindeks genap (NPM ganjil)
        int sumGenap = 0;
        System.out.print("\nElemen indeks genap: ");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
            sumGenap += numbers[i];
        }
        System.out.println("\nJumlah elemen indeks genap: " + sumGenap);
        
        // g. Cek hasil penjumlahan
        System.out.println("\nPengecekan:");
        if (sumGanjil % 2 == 0) {
            System.out.println("Jumlah indeks ganjil (" + sumGanjil + ") adalah GENAP");
        } else {
            System.out.println("Jumlah indeks ganjil (" + sumGanjil + ") adalah GANJIL");
        }
        
        // h. Urutkan elemen array
        int[] sorted = numbers.clone();
        java.util.Arrays.sort(sorted);
        System.out.println("\nArray setelah diurutkan: " + java.util.Arrays.toString(sorted));
    }
}

//Program nilai mahasiswa dengan status
class Soal4 {
    public static void jalankan() {
        System.out.println("=== SOAL 4: NILAI MAHASISWA ===\n");
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];
        
        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = sc.nextInt();
            sc.nextLine();
            
            // Tentukan status
            if (nilai[i] < 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }
        
        // Tampil daftar
        System.out.println("\n" + "=".repeat(60));
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("=".repeat(60));
        System.out.printf("%-5s %-20s %-10s %-15s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("-".repeat(60));
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-20s %-10d %-15s\n", 
                (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("=".repeat(60));
    }
}

//Program penjumlahan matriks
class Soal5 {
    public static void jalankan() {
        System.out.println("=== SOAL 5: PENJUMLAHAN MATRIKS ===\n");
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        
        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        
        // Input matriks 1
        System.out.println("\nInput Matriks 1:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks1[i][j] = sc.nextInt();
            }
        }
        
        // Input matriks 2
        System.out.println("\nInput Matriks 2:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks2[i][j] = sc.nextInt();
            }
        }
        
        // Penjumlahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        
        // Tampilkan hasil
        System.out.println("\n=== HASIL PENJUMLAHAN MATRIKS ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//Program rata-rata kelompok bilangan
class Soal6 {
    public static void jalankan() {
        System.out.println("=== SOAL 6: RATA-RATA KELOMPOK BILANGAN ===\n");
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan: ");
        int n = sc.nextInt();
        
        int[] bilangan = new int[n];
        System.out.println("\nMasukkan bilangan:");
        for (int i = 0; i < n; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = sc.nextInt();
        }
        
        // Pisahkan ke array terpisah, berdasarkan genap/ganjil
        java.util.ArrayList<Integer> listGenap = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> listGanjil = new java.util.ArrayList<>();
        
        for (int bil : bilangan) {
            if (bil % 2 == 0) {
                listGenap.add(bil);
            } else {
                listGanjil.add(bil);
            }
        }
        
        // Hitung rata-rata kelompok genap
        System.out.println("\n=== HASIL ANALISIS ===");
        if (listGenap.size() > 0) {
            double sum = 0;
            System.out.print("Bilangan Genap: ");
            for (int bil : listGenap) {
                System.out.print(bil + " ");
                sum += bil;
            }
            double avg = sum / listGenap.size();
            System.out.println("\nRata-rata bilangan genap: " + avg);
        } else {
            System.out.println("Tidak ada bilangan genap");
        }
        
        // Hitung rata-rata kelompok ganjil
        if (listGanjil.size() > 0) {
            double sum = 0;
            System.out.print("\nBilangan Ganjil: ");
            for (int bil : listGanjil) {
                System.out.print(bil + " ");
                sum += bil;
            }
            double avg = sum / listGanjil.size();
            System.out.println("\nRata-rata bilangan ganjil: " + avg);
        } else {
            System.out.println("Tidak ada bilangan ganjil");
        }
    }
}

//Program Thread dengan pewarisan
class ThreadBaru extends Thread {
    private String nama;
    
    public ThreadBaru(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nama + " - Iterasi ke-" + i);
            try {
                Thread.sleep(500); // delay 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nama + " selesai!");
    }
}

class Soal7 {
    public static void jalankan() {
        System.out.println("=== SOAL 7: THREAD DENGAN EXTENDS ===\n");
        
        ThreadBaru thread1 = new ThreadBaru("Thread-1");
        ThreadBaru thread2 = new ThreadBaru("Thread-2");
        
        System.out.println("Memulai thread...\n");
        thread1.start();
        thread2.start();
        
        System.out.println("Main thread selesai membuat thread baru!");
        System.out.println("Thread akan berjalan secara paralel...\n");
        
        // Tunggu thread selesai
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nSemua thread telah selesai!");
    }
}

//Program dengan dua thread (utama dan anak)
class ThreadAnak extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Anak dimulai");
        for (int i = 1; i <= 3; i++) {
            System.out.println("  → Thread Anak - Eksekusi ke-" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Anak selesai\n");
    }
}

class Soal8 {
    public static void jalankan() {
        System.out.println("=== SOAL 8: THREAD UTAMA & ANAK ===\n");
        
        System.out.println("Thread Utama dimulai");
        
        ThreadAnak threadAnak = new ThreadAnak();
        threadAnak.start();
        
        // Thread utama juga melakukan pekerjaan
        for (int i = 1; i <= 3; i++) {
            System.out.println("  ★ Thread Utama - Eksekusi ke-" + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Thread Utama selesai menjalankan tugasnya");
        
        // Tunggu thread anak selesai
        try {
            threadAnak.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Semua thread selesai!");
    }
}

//Dua macam perulangan untuk tampilkan array
class Soal9 {
    public static void jalankan() {
        System.out.println("=== SOAL 9: DUA MACAM PERULANGAN ===\n");
        
        int[] age = {12, 4, 5, 2, 6};
        
        // Cara 1: Menggunakan for loop biasa
        System.out.println("Cara 1 - For Loop Biasa (dengan indeks):");
        System.out.println("-".repeat(40));
        for (int i = 0; i < age.length; i++) {
            System.out.println("Elemen indeks " + i + ": " + age[i]);
        }
        
        System.out.println();
        
        // Cara 2: Menggunakan enhanced for loop (for-each)
        System.out.println("Cara 2 - Enhanced For Loop (tanpa indeks):");
        System.out.println("-".repeat(40));
        int counter = 0;
        for (int nilai : age) {
            System.out.println("Nilai ke-" + (counter++) + ": " + nilai);
        }
        
        System.out.println("\nKesimpulan:");
        System.out.println("- For biasa: Bisa akses indeks, cocok untuk modifikasi");
        System.out.println("- For-each: Lebih simple, cocok untuk baca data saja");
    }
}

//Menampilkan semua data dengan berbagai tipe
class Soal10 {
    public static void jalankan() {
        System.out.println("=== SOAL 10: MIXED DATA TYPE ===\n");
        
        // Data: {19, 0.2, C, java, true}
        Object[] data = {19, 0.2, 'C', "java", true};
        
        System.out.println("Menampilkan semua data dengan tipe berbeda:");
        System.out.println("=".repeat(60));
        
        for (int i = 0; i < data.length; i++) {
            String tipeData = data[i].getClass().getSimpleName();
            System.out.printf("Indeks %d: %-10s (Tipe: %s)\n", 
                i, data[i], tipeData);
        }
        
        System.out.println("\nPenjelasan:");
        System.out.println("- Integer  : Bilangan bulat (19)");
        System.out.println("- Double   : Bilangan desimal (0.2)");
        System.out.println("- Character: Karakter tunggal ('C')");
        System.out.println("- String   : Teks (\"java\")");
        System.out.println("- Boolean  : Nilai true/false");
    }
}
