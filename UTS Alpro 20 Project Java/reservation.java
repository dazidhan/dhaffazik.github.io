import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class reservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "";
        String pengunjung = "";
        String tanggal = "";
        String jam = "";
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktu = waktuSaatIni.format(formatWaktu);
        
        System.out.println("===== Selamat datang di CatCafe =====");
        System.out.print("Ingin mengajukan reservasi? (Y/N): ");
        String pengajuan = input.nextLine();

        if (pengajuan.equalsIgnoreCase("Y")){
            System.out.println("===== Silakan isi pengajuan di bawah ini =====");
            System.out.print("Masukkan nama\t\t: ");
            nama = input.nextLine();
            System.out.print("Jumlah pengunjung\t: ");
            pengunjung = input.nextLine();
            System.out.print("Tanggal reservasi\t: ");
            tanggal = input.nextLine();
            System.out.print("Jam reservasi\t\t: ");
            jam = input.nextLine();
        } else {
            System.out.println("Terimakasih telah mengunjungi CatCafe");
        }

        System.out.println("\n\n===== invoice reservasi Catcafe =====");
        System.out.println("Nama pengajuan\t\t: " + nama);
        System.out.println("Total Pengunjung\t: " + pengunjung);
        System.out.println("Tanggal reservasi\t: " + tanggal);
        System.out.println("Jam reservasi\t\t: " + jam);
        System.out.println("\nCatCafe");
        System.out.println(waktu+"\n");
    }
}