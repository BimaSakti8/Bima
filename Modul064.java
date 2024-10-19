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
public class Modul064 {
   public static void main(String[] args) {
       double sisiA, sisiB, sisiC;//untuk memasukan variabel
       
       Scanner keyboard = new Scanner(System.in);//ntuk menerima masukan pengguna dari keyboard
       
       System.out.println("Msukan sisi A = ");//untuk menampilkan data
       sisiA = keyboard.nextDouble();//untuk mengembalikan nilai keyboard
       
       System.out.println("Masukan sisi B = ");
       sisiB = keyboard.nextDouble();
       
       System.out.println("Masukan sisi C = ");
       sisiC = keyboard.nextDouble();
       
       if(Math.pow(sisiA, 2) == Math.pow(sisiB, 2) + Math.pow(sisiC, 2)) { //untuk mengeksekusi kode jika kondisi bernilai benar
           System.out.println("Segitiga ini mempunyai siku-siku");
       } else if(Math.pow(sisiC, 2) == Math.pow(sisiA, 2) + Math.pow(sisiB, 2)) {//untuk mengeksekusi kode jika kondisi pada if tidak memenuhi
           System.out.println("Segitiga ini mempunyai siku-siku");
       } else if(Math.pow(sisiC, 2) == Math.pow(sisiA, 2) + Math.pow(sisiB, 2)) {
           System.out.println("Segitiga ini mempunyai siku-siku");
       } else {//untuk mengeksekusi kode jika kondisi bernilai salah
           System.out.println("Segitiga ini tidak memiliki siku-siku");
       }
   } 
}
