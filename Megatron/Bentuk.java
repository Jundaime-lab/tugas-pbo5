package Megatron;

// ======================
// FILE: Bentuk.java
// ======================
abstract class Bentuk {
    private String nama;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract double luas();
    public abstract String info();
}