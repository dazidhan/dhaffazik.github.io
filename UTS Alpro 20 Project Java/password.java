import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">>>>> Program membuat password <<<<<");
        System.out.println("Minimal 6 karakter");

        System.out.print("\nBuat password: ");
        String pass = input.nextLine();

        while (pass.length() < 6) {
            System.out.println("Password minimal 6 karakter");
            System.out.print("Masukkan password baru: ");
            pass = input.nextLine();
        }

        System.out.print("Konfirmasi ulang password: ");
        String konfirmasi = input.nextLine();

        if (konfirmasi.equals(pass)) {
            System.out.println("Password berhasil dibuat");
        } else {
            System.out.println("Input salah");
        }
    }
}
