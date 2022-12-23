public class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double volBalok(){
        double volume = panjang * lebar * tinggi;
        return volume;
    }
}
