/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166015_latihan17_program.tunjangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Sri Hastuti
 * KELAS : PBO1
 * NIM : 22166015
 * DESKRIPSI PROGRAM : Program Tunjangan Gaji Pokok
 */
public class SI_RegPagi_22166015_Latihan17_ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereSystem.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println();
        
        // Input gaji pokok
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = scanner.nextDouble();

        // Input status pernikahan
        System.out.print("Apakah Anda sudah menikah? (ya/belum): ");
        String statusPernikahan = scanner.next();

        // Hitung tunjangan
        double tunjangan = 0;
        if (statusPernikahan.equalsIgnoreCase("ya")) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;
        
        // Output hasil
        System.out.println("\nDetail Gaji Karyawan:");
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
        System.out.println("Tunjangan       : Rp " + tunjangan);
        System.out.println("Total Gaji      : Rp " + totalGaji);
    }   
    
}
