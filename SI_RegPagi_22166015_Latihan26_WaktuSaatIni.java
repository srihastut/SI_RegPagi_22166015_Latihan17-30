/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166015_latihan26_waktu.saat.ini;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Sri Hastuti
 * KELAS : PBO1
 * NIM : 22166015
 * DESKRIPSI PROGRAM : Waktu Saat Ini
 */
public class SI_RegPagi_22166015_Latihan26_WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");

        String formattedTime = now.format(formatter);
        System.out.println("Hari ini adalah hari " + formattedTime);
    }
}
