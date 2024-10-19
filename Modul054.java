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
public class Modul054 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);//ntuk menerima masukan pengguna dari input
         
           System.out.print("Nilai UTS 1:");//untuk menampilkan data
           double uts1 = input.nextDouble();//untuk mengembalikan nilai double
           
            System.out.print("Nilai UTS 2:");
            double uts2 = input.nextDouble();
            
             System.out.print("Nilai UAS:");
            double uas = input.nextDouble();
            
            double nt = (0.3*uts1) + (0.3*uts2) + (0.4*uas);//untuk memasukan variabel
            
            char nh;//untuk memasukan variabel karakter
            if(nt>=80){ //untuk mengeksekusi kode jika kondisi bernilai benar
                nh = 'A';
            }else if (nt>=65){//untuk mengeksekusi kode jika kondisi pada if tidak memenuhi
              nh = 'B';
            }else if (nt>=55){  
              nh = 'C';
            }else if (nt>=50){  
              nh ='D';
            }else{ //untuk mengeksekusi kode jika kondisi bernilai salah
                nh = 'E';
                        }
            System.out.printf("Nilai Total=%.2f, Nilai huruf%c%n", nt,nh);
              
     }
    
    
}
