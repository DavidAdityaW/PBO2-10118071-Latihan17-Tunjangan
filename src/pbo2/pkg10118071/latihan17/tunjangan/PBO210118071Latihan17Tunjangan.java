/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan17.tunjangan;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     tunjangan karyawan
 * 
 */
public class PBO210118071Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        // variabel untuk menyimpan input dari user
        float gajiPokok, tunjangan, totalGaji;
        String status;

        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gajiPokok = input.nextInt(); // mendapatkan input gaji pokok dari user
        System.out.print("Status anda? (Menikah/Belum) \t : ");
        status = input.next(); // mendapatkan input status dari user
        if ("Menikah".equals(status) || "menikah".equals(status) || "MENIKAH".equals(status)) {
            tunjangan = gajiPokok * 35 / 100;
        } else {
            tunjangan = 0;
        }
        // hitung total gaji
        totalGaji = gajiPokok + tunjangan;
        // mencetak output
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok \t : " + gajiPokok);
        System.out.println("Tunjangan \t : " + tunjangan);
        System.out.println("Total Gaji \t : " + totalGaji);
        System.out.println("(Developed by : David Aditya Winarto)");
    }
    
}
