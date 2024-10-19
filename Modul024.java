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
public class Modul024 {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);//ntuk menerima masukan pengguna dari input
      
      System.out.print("Bilangan 1: ");//untuk mencetak line
      int a = input.nextInt();//untuk mengembalikan nilai int
      
       System.out.print("Bilangan 2: ");
      int b = input.nextInt();
      
      if (a>b){ //untuk mengeksekusi kode jika kondisi bernilai benar
          System.out.println("bilangan yang lebih besar adalah"+ a);
          
      } else { //untuk mengeksekusi kode jika kondisi bernilai salah
       System.out.println("bilangan yang lebih besar adalah"+ b);
      }
          
          
          
     }
}
