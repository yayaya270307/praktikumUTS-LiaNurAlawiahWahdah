public class motor {
    private String warna;
    private String merk;

    public motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }

    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }
}