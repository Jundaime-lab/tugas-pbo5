package Megatron;

// ======================
// FILE: PersegiPanjang.java
// ======================
class PersegiPanjang extends Bentuk {
    private double panjang, lebar;
    
    public PersegiPanjang() {
        super("Persegi Panjang");
        this.panjang = 0;
        this.lebar = 0;
    }

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public String info() {
        return getNama() + " | Panjang=" + panjang + " Lebar=" + lebar + " Luas=" + luas();
    }
}