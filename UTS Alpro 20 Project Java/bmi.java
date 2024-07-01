import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>> Program Mengukur Indeks Massa Tubuh <<<<<");

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        double hasil = berat / (tinggi * tinggi / 10000);

        System.out.println("Hasil BMi: " + hasil);

        if (hasil < 18.5) {
            System.out.println("Berat badan kurang");
        } else if (hasil < 23) {
            System.out.println("Berat badan normal");
        } else if (hasil < 30) {
            System.out.println("Berat bandan berlebih (kecenderungan obesitas)");
        } else if (30 > hasil) {
            System.out.println("obesitas");
        } else {
            System.out.println("Input invalid!!");
        }
    }
}
