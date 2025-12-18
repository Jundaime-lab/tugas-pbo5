package Megatron;

// ======================
// FILE: Main.java
// ======================
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU OOP JAVA ===");
            System.out.println("1. Polimorfisme Bentuk");
            System.out.println("2. Data Universitas");
            System.out.println("3. Data Kendaraan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    Bentuk[] b = {
                        new PersegiPanjang(5, 4),
                        new Segitiga(6, 3),
                        new Lingkaran(7)
                    };
                    for (Bentuk x : b) {
                        System.out.println(x.info());
                    }
                    break;
                case 2:
                    TampilData u = new Universitas();
                    u.tampil();
                    break;
                case 3:
                    Kendaraan[] k = {
                        new Mobil(),
                        new Pesawat(),
                        new KapalLaut()
                    };
                    for (Kendaraan kd : k) {
                        System.out.println(kd.informasi());
                    }
                    break;
            }
        } while (pilih != 0);

        System.out.println("Program selesai");
    }
}