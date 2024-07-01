import java.util.Scanner;

public class warteg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0; 

        System.out.println("List menu makanan:"); 
        System.out.println("1. Nasi goreng");
        System.out.println("2. Nasi uduk");
        System.out.println("3. Mie goreng");
        System.out.println("4. Kwetiau");
        System.out.println("5. Keluar");

        while (menu != 5) {
            System.out.print("Masukkan menu makanan yang ingin dipilih: ");
            menu = input.nextInt();
            
            switch (menu){
                case 1:
                    System.out.println("Anda memilih nasi goreng");
                    break;
                case 2:
                    System.out.println("Anda memilih nasi uduk");
                    break;
                case 3:
                    System.out.println("Anda memilih mie goreng");
                    break;
                case 4:
                    System.out.println("Anda memilih kwetiau"); 
                    break;
                case 5:
                    System.out.println("Terimakasih sudah mampir di warteg kami");
                    break;
                default:
                    System.out.println("Input invalid!!");
                    break;
            }
        }
        
    }
}
