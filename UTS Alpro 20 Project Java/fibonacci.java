import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1 = 0, bil2 = 1;

        System.out.println(">>>>> Program fibonacci <<<<<");
        System.out.print("Masukkan jumlah bilangan yang dicari: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print(bil1 + " ");
            int bil3 = bil1 + bil2;
            bil1 = bil2;
            bil2 = bil3;
        }
    }
}
