import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] film = {"Exhuma", "KungFu Panda 4", "Agak Laen", "Dune II"};

        int[] harga = {48000, 40000, 45000, 50000};

        System.out.println("===== Daftar Film =====");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i] + " - Rp." + harga[i]);
        }

        System.out.print("Pilih film (masukkan nomor film): ");
        int pilih = input.nextInt();

        if (pilih < 0 || pilih > film.length) {
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


    
}
