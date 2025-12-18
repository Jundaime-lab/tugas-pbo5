package Megatron;

// ======================
// FILE: Segitiga.java
// ======================
class Segitiga extends Bentuk {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public String info() {
        return getNama() + " | Alas=" + alas + " Tinggi=" + tinggi + " Luas=" + luas();
    }
}
