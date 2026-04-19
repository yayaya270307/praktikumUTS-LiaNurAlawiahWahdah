package parameter;

public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda("Polygon", 20);
        sepeda.tampilkanInfo();
        sepeda.ubahkecepatan(30);
        sepeda.tampilkanInfo();
    }
}
