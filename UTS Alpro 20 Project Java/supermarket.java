import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        double total = 0;
        String barang = "";

        System.out.println("===== Selamat datang di Indoapril =====");
        System.out.println("\n===== List barang di Indoapril =====");
        System.out.println("1. Mineral\t\t Rp.3.500");
        System.out.println("2. Mie goreng\t\t Rp.3.000");
        System.out.println("3. Minyak goreng\t Rp.34.000");
        System.out.println("4. Snack\t\t Rp.10.000");
        System.out.println("5. Sabun mandi\t\t Rp.30.000");

        System.out.print("Beli (1/2/3/4/5): ");
        int beli = input.nextInt();
        System.out.print("Jumlah barang: ");
        jumlah = input.nextInt();

        switch (beli) {
            case 1:
                barang = "Mineral";
                total = 3.500 * jumlah;
                break;
            case 2:
                barang = "Mie goreng";
                total = 3.000 * jumlah;
                break;
            case 3: 
                barang = "Minyak goreng";
                total = 34.000 * jumlah;
                break;
            case 4:
                barang = "Snack";
                total = 10.000 * jumlah;
                break;
            case 5:
                barang = "Sabun mandi";
                total = 30.000 * jumlah;
                break;        
            default:
                System.out.println("Barang tidak tersedia");
                break;
        }

        System.out.println("===== Invoice =====");
        System.out.println("Barang\t\t\t: " + barang);
        System.out.println("Jumlah barang\t\t: " + jumlah);
        System.out.printf("Total belanja\t\t: Rp.%,.3f", total);
    }
}
