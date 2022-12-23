public class Price extends Barang{
    double price;
    public Price(double panjang, double lebar, double tinggi, double kg) {
        super(panjang, lebar, tinggi, kg);
    }

    public double ongkosKirim(int panjang, int lebar, int tinggi, int kg) {
        double dim = panjang * lebar * tinggi;
        if (dim == 50 && kg == 1) {
            price = 5000;
        } else {
            price = 5000 * kg;
        }
        return price;
    }
}
