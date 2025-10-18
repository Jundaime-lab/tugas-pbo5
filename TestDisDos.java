package pertemuan3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDisDos {
    public static void main(String[] args) throws IOException{
    DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataMhs.bin"));
    
    dos.writeUTF("Nama Saya H");
    dos.writeInt(20);
    dos.writeDouble(3.50);
    
    System.out.println("Data tersebut telah berhasil dibuat");
    
    DataInputStream dis = new DataInputStream(new FileInputStream("dataMhs.bin"));
    String nama = dis.readUTF();
    int umur = dis.readInt();
    double nilai = dis.readDouble();
    
    System.out.println("Isi dari file : ");
    System.out.println("Nama : " + nama);
    
    System.out.println("Isi dari file : ");
    System.out.println("Umur : " + umur);
    
    System.out.println("Isi dari file : ");
    System.out.println("Nilai : " + nilai);
    }
}
