import java.util.Scanner;

public class descending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">>>>> Program mengurutkan bilangan <<<<<");

        System.out.print("Masukkan jumlah angka yang ingin diurutkan: ");
        int jumlah = input.nextInt();

        int [] array = new int[jumlah];

        for (int i = 0; i < array.length; i++){
            System.out.print("Masukkan bilangan: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(">>>>> Tampilkan <<<<<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
