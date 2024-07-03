import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class tiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> filmList = new ArrayList<>();
        ArrayList<Integer> hargaList = new ArrayList<>();

        bacaData(filmList, hargaList);

        System.out.println("============== Selamat Datang di Tiket Cinema Platinum ==============");

        System.out.print("Kamu masuk sebagai user atau admin: ");
        String user = input.nextLine();


        if (user.equalsIgnoreCase("admin")){
            System.out.print("Masukkan password: ");
            String pass = input.nextLine();

            if (pass.equalsIgnoreCase("adminkece")){
                
                System.out.println("\n=================== Anda berada di database ===================");

                System.out.print("Apakah mau menambahkan atau menghapus film (Tambah/Hapus): ");
                String pilihan = input.nextLine();
                
                if (!pilihan.equalsIgnoreCase("Tambah") && !pilihan.equalsIgnoreCase("Hapus")) {
                    System.out.println(">>>>> Invalid input <<<<<");
                    return;
                }
    
                if (pilihan.equalsIgnoreCase("Tambah")) {
                    System.out.print("Masukkan nama film: ");
                    String namaFilm = input.nextLine();
                    System.out.print("Masukkan harga film: ");
                    int hargaFilm = input.nextInt();
    
                    filmList.add(namaFilm);
                    hargaList.add(hargaFilm);
    
                    simpanData(filmList, hargaList);

                    System.out.println("===== Daftar Film =====");
                    for (int i = 0; i < filmList.size(); i++) {
                        System.out.println((i + 1) + ". " + filmList.get(i) + " - Rp." + hargaList.get(i));
                    }

                    System.out.println(">>>>> Film berhasil ditambahkan <<<<<");
                    
                } else if (pilihan.equalsIgnoreCase("Hapus")) {
                    System.out.println("===== Daftar Film =====");
                    for (int i = 0; i < filmList.size(); i++) {
                        System.out.println((i + 1) + ". " + filmList.get(i) + " - Rp." + hargaList.get(i));
                    }
    
                    System.out.print("Pilih nomor film yang ingin dihapus: ");
                    
                    try{
                        int nomorFilm = input.nextInt();
    
                        if (nomorFilm < 1 || nomorFilm > filmList.size()) {
                            System.out.println(">>> Nomor film tidak ditemukan <<<");
                        } else {
                            filmList.remove(nomorFilm - 1);
                            hargaList.remove(nomorFilm - 1);
        
                            simpanData(filmList, hargaList);
    
                            System.out.println("\n===== Daftar Film =====");
                            for (int i = 0; i < filmList.size(); i++) {
                                System.out.println((i + 1) + ". " + filmList.get(i) + " - Rp." + hargaList.get(i));
                            }
        
                            System.out.println(">>>>> Film berhasil dihapus <<<<<");
                        }
                        return;

                    } catch(Exception e) {
                        System.out.println("===== ERROR!!! Input harus berupa angka. Program dihentikan =====");
                        return;
                    }
                } 
            } else {
                System.out.println("Password salah!!");
                return;
            }
            
        } else if (user.equalsIgnoreCase("user")){
            System.out.println("===== Daftar Film =====");
            for (int i = 0; i < filmList.size(); i++) {
                System.out.println((i + 1) + ". " + filmList.get(i) + " - Rp." + hargaList.get(i));
            }

            System.out.print("Pilih film (masukkan nomor film): ");
            try {
                int pilih = input.nextInt();
                if (pilih < 1 || pilih > filmList.size()) {
                    System.out.println("Film tidak tersedia");
                    return;
                }

                System.out.print("Jumlah tiket: ");
                int jumlahTiket = input.nextInt();

                int totalHarga = hargaList.get(pilih - 1) * jumlahTiket;

                System.out.println("===== Invoice Pemesanan Tiket =====");
                System.out.println("Film\t\t: " + filmList.get(pilih - 1));
                System.out.println("Jumlah tiket\t: " + jumlahTiket);
                System.out.println("Total harga\t: " + totalHarga);

            } catch (Exception e) {
                System.out.println("===== ERROR!!! Input harus berupa angka. Program dihentikan =====");
                return;
            }

        } else {
            System.out.println("Pilihan invalid");
            return;
        }
    }

    public static void bacaData(ArrayList<String> filmList, ArrayList<Integer> hargaList) {
        try (Scanner filmScanner = new Scanner(new File("film.txt"));
             Scanner hargaScanner = new Scanner(new File("harga.txt"))) {
            while (filmScanner.hasNextLine()) {
                filmList.add(filmScanner.nextLine());
            }
            while (hargaScanner.hasNextLine()) {
                hargaList.add(Integer.parseInt(hargaScanner.nextLine()));
            }
        } catch (IOException e) {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void simpanData(ArrayList<String> filmList, ArrayList<Integer> hargaList) {
        try (BufferedWriter filmWriter = new BufferedWriter(new FileWriter("film.txt"));
             BufferedWriter hargaWriter = new BufferedWriter(new FileWriter("harga.txt"))) {
            for (String film : filmList) {
                filmWriter.write(film);
                filmWriter.newLine();
            }
            for (int harga : hargaList) {
                hargaWriter.write(Integer.toString(harga));
                hargaWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
