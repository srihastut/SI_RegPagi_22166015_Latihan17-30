/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166015_latihan21_program.rata.rata.nilai;
import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Sri Hastuti
 * KELAS : PBO1
 * NIM : 22166015
 * DESKRIPSI PROGRAM : Program Rata-Rata Nilai
 */
public class SI_RegPagi_22166015_Latihan21_ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Inisialisasi variabel
        int jumlahMahasiswa = 0;
        int banyakMahasiswa;
        double rataRata;
        
        // Input banyak nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai: ");
        banyakMahasiswa = input.nextInt();
        
        // Input nilai dan hitung jumlah nilai
        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            int nilai = input.nextInt();
            jumlahMahasiswa += nilai;
        }
        
        // Hitung rata-rata
        rataRata = (double) jumlahMahasiswa / banyakMahasiswa;
        
        // Output rata-rata
        System.out.println("Rata-rata nilai adalah " + rataRata);
        
        // Developed by
        System.out.println("Developed by : Sri Hastuti");
    }
}

