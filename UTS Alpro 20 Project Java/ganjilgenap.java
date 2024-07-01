import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program menentukan bilangan ganji atau genap");
        System.out.print("Masukkan angka: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " merupakan bilangan genap");
        } else if (bilangan % 2 !=0) {
            System.out.println(bilangan + " merupakan bilangan ganjil");
        } else {
            System.out.println("Input Invalid!");
        }
    }
}
