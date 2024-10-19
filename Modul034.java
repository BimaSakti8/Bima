/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul004;
import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class Modul034 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);//ntuk menerima masukan pengguna dari input
         
          System.out.print("Nama:");//untuk mencetak data
          String nama = input.nextLine();//untuk mengembalikan nilai string
         
         System.out.print("Tinggi Badan (dalam cm):");
         double Tinggibadan = input.nextInt();//untuk mengembalikan nilai double
         
          System.out.print("Berat Badan (dalam kg):");
         double Beratbadan = input.nextInt();
          
         double selisih = Tinggibadan-Beratbadan;//untuk memasukan variabel
        
        if (selisih >= 90 && selisih <= 100){//untuk mengeksekusi kode jika kondisi bernilai benar
         System.out.println(nama + "memiliki berat yang ideal");
        }else if (selisih < 90){ //untuk mengeksekusi kode jika kondisi pada if tidak memenuhi
            System.out.println(nama + "memiliki berat yang gemuk");
        }else{    //untuk mengeksekusi kode jika kondisi bernilai salah
             System.out.println(nama + "memiliki berat yang kurus");
            
        }
        
    }
}
