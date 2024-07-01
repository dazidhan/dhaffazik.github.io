import java.util.Scanner;;

public class ratarata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        
        System.out.println(">>>>> Program mencari rata rata <<<<<");
        System.out.print("Masukkan jumlah bilangan yang ingin dicari: ");
        double jumlah = input.nextDouble();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double bil = input.nextDouble();
            total += bil;
        }

        double ratarata = total/jumlah;

        System.out.println("Rata rata dari bilangan yang diinput adalah: " + ratarata);
    }
}