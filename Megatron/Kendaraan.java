package Megatron;

// ======================
// FILE: Kendaraan.java
// ======================
abstract class Kendaraan {
    protected String nama, jenis;

    public Kendaraan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    abstract String informasi();
}