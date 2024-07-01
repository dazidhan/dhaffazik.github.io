import java.util.Scanner;

public class kehadiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String status = "";

        System.out.println("===== Program Kehadiran Siswa =====");
        System.out.print("Masukkan nama lengkap\t: ");
        String nama = input.nextLine();
        System.out.print("Masukkan kelas\t\t: ");
        String kelas = input.nextLine();
        System.out.print("Presensi (H/S/I/TK)\t: ");
        String absen = input.nextLine();

        if (absen.equalsIgnoreCase("H")){
            status = "Hadir";
        } else if (absen.equalsIgnoreCase("S")){
            status = "Sakit";
        } else if (absen.equalsIgnoreCase("I")){
            status = "Izin";
        } else if (absen.equalsIgnoreCase("TK")){
            status = "Tanpa keterangan";
        } else {
            System.out.println("Input invalid!!");
        }

        System.out.println("===== Presensi =====");
        System.out.println("Nama lengkap\t: " + nama);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Kehadiran\t: " + status);
    }
}
