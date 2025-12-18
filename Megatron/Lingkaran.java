package Megatron;

// ======================
// FILE: Lingkaran.java
// ======================
class Lingkaran extends Bentuk {
    private double r;

    public Lingkaran(double r) {
        super("Lingkaran");
        this.r = r;
    }

    @Override
    public double luas() {
        return Math.PI * r * r;
    }

    @Override
    public String info() {
        return getNama() + " | Jari-jari=" + r + " Luas=" + luas();
    }
}
