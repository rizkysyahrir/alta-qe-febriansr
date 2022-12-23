import java.util.Scanner;

public class MainProblem1 {
    public static void main(String[] args) {
        float hasil; int bil;
try (//No 1
        Scanner input = new Scanner(System.in)) {
            System.out.println("coba edit lagi deh coba");
            System.out.println("Luas Segitiga");
            System.out.print("Masukkan nilai alas: ");
            float a = input.nextInt();//input manual
            System.out.print("Masukkan nilai tinggi: ");
            float t = input.nextInt();//input manual
            hasil = (a*t)/2;
            System.out.println("Luas Segitiga = " + hasil);
            System.out.println("===================================");
//No 2
            int nilai;
            System.out.print("Masukkan nilai (0 - 100): ");
            nilai = input.nextInt();//input manual

            if (nilai <= 100 && nilai >= 80 ) {
                System.out.println("Nilai A");
            }
            else if (nilai >= 65 && nilai < 80) {
                System.out.println("Nilai B+");
            }
            else if (nilai >= 50 && nilai < 65) {
                System.out.println("Nilai B");
            }
            else if (nilai >= 35 && nilai < 50) {
                System.out.println("Nilai C");
            }
            else if (nilai >= 0 && nilai < 35) {
                System.out.println("Nilai D");
            }
            else if (nilai < 0 || nilai > 100){
                System.out.println("Nilai Invalid!");
            } else {
                System.out.println("Maaf, format nilai tidak sesuai");
            }
//No 3
            System.out.println("===================================");
            System.out.print("Masukkan angka : ");
            bil = input.nextInt();//input manual
        }
        for(int i=1;i<=bil;i++)
        {
            if(bil%i == 0)
            {
                System.out.println(i + " ");
            }
        }
        System.out.println("===================================");

    }
}