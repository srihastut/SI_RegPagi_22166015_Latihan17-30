/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166015_latihan20_target.saldo.tabungan;
package tugas;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA : Sri Hastuti
 * KELAS : PBO1
 * NIM : 22166015
 * DESKRIPSI PROGRAM : Target Saldo Tabungan
 */
public class SI_RegPagi_22166015_Latihan20_TargetSaldoTabungan {
   public static void main(String[] args) {
        // Saldo Awal
        double saldoAwal = 3500000;
        // Bunga per Bulan (dalam persen)
        double BungaPerBulan = 8.0;
        // Lama (bulan)
        double saldoTarget = 6000000;
        
         // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        // Hitung saldo per bulan
        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * (BungaPerBulan / 100);
            saldoAwal += bunga;
            bulan++;
        // Format saldo per bulan sebagai mata uang
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di Bulan ke- " + bulan + ": Rp. " + saldoBulanFormatted);
        }
    }

}
  