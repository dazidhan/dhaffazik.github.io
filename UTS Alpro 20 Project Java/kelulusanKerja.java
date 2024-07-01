import java.util.Scanner;

public class kelulusanKerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jk;
        int tinggi;
        System.out.println("Program menentukan kelulusan diterima kerja");

        System.out.print("Tentukan jenis kelamin (L/P): ");
        jk = input.nextLine();

        System.out.print("Masukkan tinggi badan (cm): ");
        tinggi = input.nextInt();

        if (jk.equalsIgnoreCase("L")) {
            if (tinggi >= 165) {
                System.out.println("Selamat, Anda dinyatakan lulus!");
            } else {
                System.out.println("Maaf, Anda tidak memenuhi syarat kelulusan laki-laki");
            }
        } else if (jk.equalsIgnoreCase("P")) {
            if (tinggi >= 160) {
                System.out.println("Selamat, Anda dinyatakan lulus!");
            } else {
                System.out.println("Maaf, Anda tidak memenuhi syarat kelulusan perempuan");
            }
        } else {
            System.out.println("Input jenis kelamin tidak valid.");
        }
    }
}
