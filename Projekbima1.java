/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projekbima1;
import java.util.Scanner;

/**
 *
 * @author M S I
 */
public class Projekbima1 {

     public static void main(String[] args) {
         int Jlh, HB=0, HT;
         String UK;
         Scanner keyboard = new Scanner(System.in);
        
         System.out.println("Masukan ukuran : ");
         UK = keyboard.nextLine();
         System.out.println("Masukan jumlah baju yang dibeli : ");
         Jlh = keyboard.nextInt();
         
         if(UK.equalsIgnoreCase("S")) {
             HB = 300000;
         } else if(UK.equalsIgnoreCase("M")) {
             HB = 350000;
         } else if(UK.equalsIgnoreCase("L")) {
             HB = 45000;
         } else if(UK.equalsIgnoreCase("XL")) {
             HB = 50000;
         }else if(UK.equalsIgnoreCase("XXL")) {
             HB = 60000;
         } else {
             System.out.println("Input Tidak Valid");
         }
         
         HT = (Jlh*HB);
         System.out.println("Total Bayar : "+HT);
     }
}
