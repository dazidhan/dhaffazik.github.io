import java.util.Scanner;
import java.util.Random;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random angkaRandom = new Random();


        System.out.println(">>>>> Program tebak angka random <<<<<");
        System.out.print("Pilih angka dari 1-10: ");
        int angka = input.nextInt();
        int angkaBenar = angkaRandom.nextInt(10) +1;

        if (angka == angkaBenar){
            System.out.println("Selamat jawaban anda benar!!");
        } else {
            System.out.println("Jawaban anda salah!!");
            System.out.println("yang benar adalah >>> " + angkaBenar);
        }
    }
}
