/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan35.programtunjanganoo;
import Karyawan.Karyawan;
import java.util.Scanner;
/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program hitung tunjangan karyawan
 */
public class PBOIF210119049Latihan35ProgramTunjanganOO {
    public static Scanner scan = new Scanner(System.in); //object scan
    
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan(); // object karyawan
        
        System.out.println("================PROGRAM TUNJANGAN ===============");
        System.out.print("Berapa gaji pokok anda perbulan ? : ");
        karyawan.gajiPokok = scan.nextDouble();
        System.out.print("Status Menikah ? (Menikah/Belum) : ");
        karyawan.status = scan.next();
        
        System.out.printf("\n================Hasil Perhitungan Gaji Anda===============\n");
        System.out.println("Gaji Pokok        : " + karyawan.gajiPokok);
        System.out.println("Tunjangan         : " + karyawan.getTunjangan());
        System.out.println("Total Gaji        : " + karyawan.getTotalGaji());
        System.out.println("Developed by Nur Sasongko");
    }
    
}
