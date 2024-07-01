import java.util.Scanner;

public class luas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result;

        int pilih;

        System.out.println(">>>>> Program menghitung luas <<<<<");
        System.out.println("1. luas lingkaran");
        System.out.println("2. luas persegi");
        System.out.println("3. luas persegi panjang");
        System.out.println("4. luas segitiga");
        System.out.println("5. keluar");

        System.out.print("Pilih luas bangun datar yang ingin dicari (1/2/3/4/5): ");
        pilih = input.nextInt();

        while (pilih != 5) {
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jari jari lingkaran: ");
                    int r = input.nextInt();
                    result = 3.14 * r * r;
                    System.out.println("Luas lingkaran: " + result);
                    break;

                case 2:
                    System.out.print("Masukkan sisi persegi: ");
                    int s = input.nextInt();
                    result = s * s;
                    System.out.println("Luas persegi: " + result);
                    break;

                case 3:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int p = input.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int l = input.nextInt();
                    result = p * l;
                    System.out.println("Luas persegi panjang: " + result);
                    break;

                case 4:
                    System.out.print("masukkan alas segitiga: ");
                    int a = input.nextInt();
                    System.out.print("Masukkan tinggi segitiga: ");
                    int t = input.nextInt();
                    result = 0.5 * a * t;
                    System.out.println("Luas segitiga: " + result);
                    break;

                default:
                    System.out.println("Input invalid!!");
                    break;
            }  

            System.out.print("\nPilih luas bangun datar yang ingin dicari (1/2/3/4/5): ");
            pilih = input.nextInt();
        }

        System.out.println("Keluar program");
    }
}
