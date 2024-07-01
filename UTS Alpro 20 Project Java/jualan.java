import java.util.Scanner;
import java.util.ArrayList;

public class jualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] film = {"Exhuma", "KungFu Panda 4", "Agak Laen", "Dune II"};
        int[] harga = {48000, 40000, 45000, 50000};

        System.out.print("Kamu sebagai pembeli atau penjual: ");
        String user = input.nextLine();

        if (user.equalsIgnoreCase("penjual")){
            System.out.print("Apakah mau menambahkan barang(Y/N): ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("Y")){
                System.out.print("Masukkan nama film: ");
                String namaFilm = input.nextLine();
                System.out.print("Masukkan harga film: ");
                int hargaFilm = input.nextInt();

                film = tambahFilm(namaFilm, film);
                harga = tambahHarga(hargaFilm, harga);
            } else {
                System.out.println("Tidak ada barang baru yang diinput");
            }
        }
        
        System.out.println("===== Daftar Film =====");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i] + " - Rp." + harga[i]);
        }

        System.out.print("Pilih film (masukkan nomor film): ");
        int pilih = input.nextInt();

        if (pilih < 1 || pilih > film.length) {
            System.out.println("Film tidak tersedia");
            return;
        }

        System.out.print("Jumlah tiket: ");
        int jumlahTiket = input.nextInt();

        int totalHarga = harga[pilih - 1] * jumlahTiket;

        System.out.println("===== Invoice Pemesanan Tiket =====");
        System.out.println("Film\t\t: " + film[pilih - 1]);
        System.out.println("Jumlah tiket\t: " + jumlahTiket);
        System.out.println("Total harga\t: " + totalHarga);
    }

    public static String[] tambahFilm(String namaFilm, String[] film) {
        String[] filmBaru = new String[film.length + 1];

        for (int i = 0; i < film.length; i++) {
            filmBaru[i] = film[i];
        }

        filmBaru[film.length] = namaFilm;

        return filmBaru;
    }

    public static int[] tambahHarga(int hargaFilm, int[] harga){
        int[] hargaBaru = new int[harga.length + 1];

        for (int i = 0; i < harga.length; i++){
            hargaBaru[i] = harga[i];
        }

        hargaBaru[harga.length] = hargaFilm;

        return hargaBaru;
    }
}
