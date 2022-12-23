public class Kubus {
    double s;

    public Kubus(double s) {
        this.s = s;
    }

    public double volKubus() {
        double volume = Math.pow(s, 3);
        return  volume;
    }
}