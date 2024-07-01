import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 1000000;

        System.out.println("===== Selamat Datang di Bank ABC");
        System.out.println(">>>>> Pilih Jenis Transaksi <<<<<");
        System.out.println("1. Penarikan");
        System.out.println("2. Transfer");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan: ");
        int plihan = input.nextInt();

        switch (plihan) {
            case 1:
                System.out.print("Silakan masukkan jumlah penarikan: Rp.");
                double penarikan = input.nextDouble();

                if (saldo >= penarikan){
                    saldo -= penarikan;
                } else {
                    System.out.println("Saldo anda kurang");
                }
                break;
            case 2:
                System.out.print("Masukkan rekening yang dituju: ");
                int rekTujuan = input.nextInt();
                System.out.print("Masukkan jumlah transfer: Rp.");
                double transfer = input.nextDouble();

                if (saldo >= transfer){
                    saldo -= transfer;
                } else {
                    System.out.println("Saldo anda kurang");
                }
                break;
            case 3: 
                System.out.println("Terimakasih sudah menggunakan layanan kami");
                return;
            default:
                System.out.println("Input invalid");
                return;
        }

        System.out.print("Ingin menampilkan saldo? (Y/N): ");
        String tampilSaldo = input.next();

        if (tampilSaldo.equalsIgnoreCase("Y")) {
            System.out.printf("\nSaldo anda\t\t\t: Rp.%,.2f", saldo);
            System.out.println("\nTerimakasih telah menggunakan layanan Bank ABC");
        } else {
            System.out.println("\nTerimakasih telah menggunakan layanan Bank ABC");
        }
    }
}
