package Megatron;

// ======================
// FILE: KapalLaut.java
// ======================
class KapalLaut extends Kendaraan {
    public KapalLaut() {
        super("Kapal Laut", "Air");
    }

    @Override
    String informasi() {
        return "Kendaraan=" + nama + " | Jenis=" + jenis;
    }
}

