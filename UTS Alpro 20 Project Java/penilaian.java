import java.util.Scanner;;

public class penilaian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Program Penilain =====");

        System.out.print("Berapa soal yang benar dari 20 pertanyaan: ");
        int benar = input.nextInt();

        double nilai = (benar * 0.5) * 10;

        System.out.println("Nilai anda: " + nilai);

        if (nilai >= 90) {
            System.out.println("Kamu mendapatkan A");
        } else if (nilai >= 80){
            System.out.println("Kamu mendapatkan B");
        } else if (nilai >= 70){
            System.out.println("Kamu mendapatkan C");
        } else if (nilai >= 60){
            System.out.println("Kamu mendapatkan D");
        } else {
            System.out.println("Kamu mendapatkan E");
        }
    }
}