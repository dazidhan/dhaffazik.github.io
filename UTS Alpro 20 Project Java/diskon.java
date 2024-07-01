import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">>>>> Program menghitung diskon <<<<<");
        System.out.print("Masukkan harga barang: Rp.");
        double harga = input.nextDouble();

        System.out.print("Masukkan diskon barang (%): ");
        int diskonPersen = input.nextInt();

        double diskon = harga * diskonPersen / 100;

        double hargaAkhir = harga - diskon;

        System.out.println("\nHarga barang: Rp." + harga);
        System.out.println("Diskon: " + diskonPersen + "%");
        System.out.println("Diskon: RP." + diskon);
        System.out.println("Harga akhir: Rp." + hargaAkhir);
    }
    
}
