import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>> Program konversi suhu <<<<<");
        System.out.print("pilih suhu awal celcius/fahrenheit (C/F): ");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("C")) {
            System.out.println("Anda akan mengubah dari celcius ke fahrenheit");
            System.out.print("Masukkan suhu awal: ");
            double celcius = input.nextDouble();

            double result = (9/5 * celcius) + 32;

            System.out.print("Hasilnya adalah: " + result + " fahrenheit");

        } else if (pilihan.equalsIgnoreCase("F")) {
            System.out.println("Anda akan mengubah dari fahrenheit ke celcius");
            System.out.print("Masukkan suhu awal: ");
            double fahrenheit = input.nextDouble();

            double result = (fahrenheit-32) * 5/9;

            System.out.print("Hasilnya adalah: " + result + " celcius");

        } else {
            System.out.println("Input invalid!!");
        }

        
    }
}