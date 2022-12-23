public class Tabung {
    double diameter;
    double tinggi;

    public Tabung(double diameter, double tinggi) {
        this.diameter = diameter;
        this.tinggi = tinggi;
    }

    public double volTabung(){
        double volume = Math.PI * Math.pow(diameter, 2) * tinggi;
        return Math.ceil(volume);
    }
}
