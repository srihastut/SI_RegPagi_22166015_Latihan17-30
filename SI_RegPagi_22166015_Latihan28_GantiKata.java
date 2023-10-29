/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166015_latihan28_ganti.kata;
import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Sri Hastuti
 * KELAS : PBO1
 * NIM : 22166015
 * DESKRIPSI PROGRAM : Ganti Kata
 */
public class SI_RegPagi_22166015_Latihan28_GantiKata {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        System.out.print("Ganti Kata: ");
        String oldWord = input.next();

        System.out.print("Menjadi Kata: ");
        String newWord = input.next();

        String newSentence = sentence.replaceAll(oldWord, newWord);

        System.out.println("----Hasil Formatting----");
        System.out.println("Kalimat awal: " + sentence);
        System.out.println("Kalimat baru: " + newSentence);
    }
}
