/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo3;

import java.util.Scanner;//library untuk input data menggunakan keyboard

/**
 *
 * @author ASUS
 */
public class nomor1 {
    public static void main(String[] args){ //kode awal java
        Scanner keyboard = new Scanner(System.in); //variabel scanner yg digunakan nanti dalam input data

        //Deklarasi variabel
        String kalimat,huruf,jenisHuruf;
        int jumlahHuruf,nomor;


        System.out.println("TUGAS PBO PERTEMUAN KE 3 NOMOR 1"); 

        //input data
        System.out.print("input kalimat dengan 3 huruf : "); 
        kalimat = keyboard.nextLine(); // input variabel kalimat
        jumlahHuruf = kalimat.length(); // mengambil jumlah karakter dalam string
        if (jumlahHuruf == 3) { // membatasi jumlah karakter 3 jika benar 3 maka jalankan perintah for dibawah
            for(int i=0;i<3;i++){ // perulangan 3 kali
                huruf = kalimat.substring(i, i+1); // mengambil huruf perhuruf dari variabel kalimat
                if((huruf.equals("a")) || (huruf.equals("i")) || (huruf.equals("u")) || (huruf.equals("e")) || (huruf.equals("o"))){ // jika huruf yang diambil karakter a,i,u,e,o maka
                    jenisHuruf = "Vokal"; // mengisi variabel jenisHuruf dengan vokal
                }else{
                    jenisHuruf = "Konsonan"; // mengisi variabel jenisHuruf dengan konsonan
                }
                nomor = i+1; // membuat nomor untuk di digunakan di bagian output
                
                // output
                System.out.println("Huruf ke-"+nomor+" : "+jenisHuruf); // menampilkan vocal atau konsonan
            }
        }else{

        }
    }
    
}
