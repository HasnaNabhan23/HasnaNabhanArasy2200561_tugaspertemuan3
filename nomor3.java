/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nomor3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // Deklarasi variabel
        int jamMasuk, jamKeluar, hasilPengurangan,lamaBekerja;

        // Input data
        System.out.print("Jam Masuk : ");
        jamMasuk = keyboard.nextInt();
        System.out.print("Jam Keluar : ");
        jamKeluar = keyboard.nextInt();

        //Proses
        // jam masuk dan jam keluar harus dikurangkan hingga dapet 
        // dengan cara jam keluar - jam masuk
        hasilPengurangan = jamKeluar - jamMasuk;
        
        // hasil pengurangan karena waktunya 24 jam maka jika kasus nya seperti contoh 1
        // masuk jam 8 keluar jam 11 maka hasil selisihnya 3
        // jika kasusnya masuk jam 11 keluar jam 3 maka  selisihnya -8
        // ga ada jam -8, jika hasilnya minus maka tambahkan 24
        if(hasilPengurangan > 0 ){
            lamaBekerja = hasilPengurangan;
        }else{
            jamKeluar = jamKeluar + 24;
            hasilPengurangan = jamKeluar - jamMasuk;
            lamaBekerja = hasilPengurangan;
            jamKeluar = jamKeluar - 24;
        }

        //output
        if (lamaBekerja <= 12){
            System.out.println("---------Hasil Pendataan------");
            System.out.println("Jam Masuk : "+jamMasuk);
            System.out.println("Jam Keluar : "+jamKeluar);
            System.out.println("Lama Bekerja : "+lamaBekerja);
        }else{
            System.out.println("Lama bekerja >12 jam");
        }
        
        
    }
}
