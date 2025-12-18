package Megatron;

// ======================
// FILE: Pesawat.java
// ======================
class Pesawat extends Kendaraan {
    public Pesawat() {
        super("Pesawat", "Udara");
    }

    @Override
    String informasi() {
        return "Kendaraan=" + nama + " | Jenis=" + jenis;
    }
}