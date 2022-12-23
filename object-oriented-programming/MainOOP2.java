public class MainOOP2 {
    public static void main(String[] args) {

        Kubus kubus = new Kubus(3);
        Balok balok = new Balok(3, 6, 10);
        Tabung tabung = new Tabung(7,10);

        System.out.println("Volume");
        System.out.println("Kubus "+ (kubus.volKubus()));
        System.out.println("Balok: "+ balok.volBalok());
        System.out.println("Tabung: "+ tabung.volTabung());
    }   
}
