/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class modul55 {
    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);    
        
    
        System.out.println("Masukan nama : ");
         String nama = keyboard.nextLine();
        
        System.out.println("Menu Masa Kerja (0-1/11-20/21/30)");
        System.out.println("Pilih masa kerja anda : ");
         int masker = keyboard.nextInt();
       
         keyboard.nextLine();
         
         
        System.out.println("Pilih Golongan (I/II/III/IV) : ");
         String gol = keyboard.nextLine();
         
          
        
        System.out.println("Masukan Gaji Anda : ");
         int gj = keyboard.nextInt();
         
         int bonuskar = 0;
         
       switch (gol) {
           case "I" :
               if (masker >=0 && masker <= 10){
                   bonuskar = 50;
               }else if (masker <= 20){
                   bonuskar = 60;
               }else if (masker <= 30){
                   bonuskar = 70;
               }
            break;
           
          case "II" :
               if (masker >=0 && masker <= 10){
                   bonuskar = 50;
               }else if (masker <= 20){
                   bonuskar = 70;
               }else if (masker <= 30){
                   bonuskar = 80;
               }
            break;  
            
          case "III" :
               if (masker >=0 && masker <= 10){
                   bonuskar = 70;
               }else if (masker <= 20){
                   bonuskar = 80;
               }else if (masker <= 30){
                   bonuskar = 90;
               }
            break;  
            
          case "IV" :
               if (masker >=0 && masker <= 10){
                   bonuskar = 80;
               }else if (masker <= 20){
                   bonuskar = 90;
               }else if (masker <= 30){
                   bonuskar = 100;
               }
            break;  
            
          default :
              System.out.println("Golongan yang anda masukan tidak valid");
            
       } 

             int bonus = gj + (gj * bonuskar / 100);
             
          System.out.println("Bonus untuk karyawan adalah : " + bonuskar + "%");   
          System.out.println("Jumlah gaji yang diberikan adalah : "       + bonus);
        
    }
}
