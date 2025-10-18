package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBFR {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            
            String nama;
            int umur;
            double nilai;
            char kelas;
            boolean keaktifan;
            
            /*System.out.println("Masukan Nama : ");
            nama = br.readLine();
            System.out.println("Nama : " + nama);
            
            System.out.println("Masukan Umur : ");
            umur = Integer.parseInt(br.readLine());
            System.out.println("Umur : " + (umur + 5));*/
            
            System.out.println("Masukan Nilai: ");
            nilai = Double.parseDouble(br.readLine());
            System.out.println("Umur : " + (nilai));
    }
}
