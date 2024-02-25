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
public class nomor2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        //Deklarasi variabel
        int sisi1,sisi2,sisi3;
        String hasil;
        
        System.out.println("TUGAS PBO PERTEMUAN KE 3 NOMOR 2");

        //input data
        System.out.print("Masukan sisi ke-1 : ");
        sisi1 = keyboard.nextInt();
        System.out.print("Masukan sisi ke-2 : ");
        sisi2 = keyboard.nextInt();
        System.out.print("Masukan sisi ke-3 : ");
        sisi3 = keyboard.nextInt();

        //proses
        if((sisi1 == sisi2) && (sisi1 == sisi3) && (sisi2 == sisi3)){  // jika ketiga sisi sama maka hasil = termasuk kubus
            hasil = "Termasuk kubus"; // input variabel hasil
        }else{
            hasil = "Bukan kubus"; //input variabel hasil
        }

        //output
        System.out.println(hasil);
    }
    
}
