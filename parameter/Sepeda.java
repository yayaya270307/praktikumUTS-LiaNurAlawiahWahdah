package parameter;

public class Sepeda {
    private String merk;
    private int kecepatan;

    public Sepeda(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public void ubahkecepatan(int kecepatanBaru) {
        this.kecepatan = kecepatanBaru;
    }
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + "km/jam");
    }
}
