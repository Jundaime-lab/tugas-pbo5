package Megatron;

// ======================
// FILE: Mobil.java
// ======================
class Mobil extends Kendaraan {
    public Mobil() {
        super("Mobil", "Darat");
    }

    @Override
    String informasi() {
        return "Kendaraan=" + nama + " | Jenis=" + jenis;
    }
}