import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;

        System.out.println("Program kalkulator sederhana");
        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan operasi bilangan: ");
        char operasi = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = input.nextDouble();

        switch (operasi) {
            case '+':
                result = bil1 + bil2;
                break;
            case '-':
                result = bil1 - bil2;
                break;
            case '*':
                result = bil1 * bil2;
                break;
            case '/':
                if (bil2 != 0){
                    result = bil1 / bil2;
                } else {
                    System.out.println("Tidak bisa dibagi dengan 0");
                }
                break;
            default:
                System.out.println("Input invalid!!");
                break;
        }

        System.out.println("Hasilnya adalah: " + result);
    }
}