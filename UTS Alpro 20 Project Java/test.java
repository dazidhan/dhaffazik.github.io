import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class test {
    private static ArrayList<String> film = new ArrayList<>();
    private static ArrayList<Integer> harga = new ArrayList<>();
    private static final String FILENAME = "data";

    public static void main(String[] args) {
        loadDataFromFile();
        Scanner input = new Scanner(System.in);
        System.out.print("Kamu sebagai pembeli atau penjual: ");
        String user = input.nextLine();

        if (user.equalsIgnoreCase("penjual")) {
            tambahBarang();
        }

        tampilkanDaftar();
        pesanTiket(input);
    }

    public static void tambahBarang() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Apakah mau menambahkan barang(Y/N): ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("Y")) {
                System.out.print("Masukkan nama film: ");
                String namaFilm = input.nextLine();
                System.out.print("Masukkan harga film: ");
                int hargaFilm = input.nextInt();
                film.add(namaFilm);
                harga.add(hargaFilm);
                saveDataToFile();
            } else {
                System.out.println("Tidak ada barang baru yang diinput");
            }
        }
    }

    public static void tampilkanDaftar() {
        System.out.println("===== Daftar Film =====");
        for (int i = 0; i < film.size(); i++) {
            System.out.println((i + 1) + ". " + film.get(i) + " - Rp." + harga.get(i));
        }
    }

    public static void pesanTiket(Scanner input) {
        System.out.print("Pilih film (masukkan nomor film): ");
        int pilih = input.nextInt();
        input.nextLine(); // Membersihkan karakter baru (\n) di buffer
    
        if (pilih < 1 || pilih > film.size()) {
            System.out.println("Film tidak tersedia");
            return;
        }
    
        System.out.print("Jumlah tiket: ");
        int jumlahTiket = input.nextInt();
        input.nextLine(); // Membersihkan karakter baru (\n) di buffer
    
        int totalHarga = harga.get(pilih - 1) * jumlahTiket;
    
        System.out.println("===== Invoice Pemesanan Tiket =====");
        System.out.println("Film\t\t: " + film.get(pilih - 1));
        System.out.println("Jumlah tiket\t: " + jumlahTiket);
        System.out.println("Total harga\t: " + totalHarga);
    }
    

    private static void loadDataFromFile() {
        try (Scanner scanner = new Scanner(new File(FILENAME))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                film.add(parts[0]);
                harga.add(Integer.parseInt(parts[1]));
            }
        } catch (IOException e) {
            System.out.println("Tidak dapat memuat data dari file. Data default akan digunakan.");
        }
    }

    private static void saveDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (int i = 0; i < film.size(); i++) {
                writer.write(film.get(i) + ":" + harga.get(i));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Tidak dapat menyimpan data ke file.");
        }
    }
}
