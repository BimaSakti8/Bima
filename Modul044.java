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
public class Modul044 {
     public static void main(String[] args) {
        int hargabarang = 100000;//untuk memasukan variabel
        int jmlhbarang;
        
          Scanner input = new Scanner(System.in);//ntuk menerima masukan pengguna dari input
         
         
          System.out.println("Jumlah Barang:");//untuk menampilkan line
         jmlhbarang=input.nextInt();//untuk mengembalikan nilai int
         
         int totalhrg = hargabarang*jmlhbarang;//untuk memasukan variabel
         
         if (totalhrg >=1000000) { //untuk mengeksekusi kode jika kondisi bernilai benar
         double diskon = 0.10* totalhrg;
         double hargasetelahdiskon = totalhrg-diskon;
         System.out.println("Total Harga:" + totalhrg);
         System.out.println("Diskon adalah:" + diskon);
         
         System.out.println("Total harga jika diskon: " +hargasetelahdiskon);
         
         }else{ //untuk mengeksekusi kode jika kondisi bernilai salah
         System.out.println("Total: " + totalhrg);
         System.out.println("Anda tidak dapat diskon");
             
         }
         
     }
    
}
