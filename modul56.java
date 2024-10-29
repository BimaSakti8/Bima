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
public class modul56 {
    
enum Agama {
    Katolik,Kristen,Islam,Hindu,Budha,Yahudi
}    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Pilihan Agama  : ");  
        System.out.println("1.Katolik,2.Kristen,3.Islam,4.Hindu,5.Budha,6.Yahudi");
          int pilihan = scanner.nextInt();
          
        Agama agama = null;
        
       switch (pilihan) {
            case 1:
                agama = Agama.Katolik;
                break;
            case 2:
                agama = Agama.Kristen;
                break;
            case 3:
                agama = Agama.Islam;
                break;
            case 4:
                agama = Agama.Hindu;
                break;
            case 5:
                agama = Agama.Budha;
                break;
            case 6:
                agama = Agama.Yahudi;
                break;
            default:
                System.out.println("Pilihan Tidak Valid.");
                ;
                return; 
        }

        
        switch (agama) {
            case Katolik:
                System.out.println("Kitab Suci: Injil");
                System.out.println("Nabi: Yesus");
                break;
            case Kristen:
                System.out.println("Kitab Suci: Injil");
                System.out.println("Nabi: Yesus");
                break;
            case Islam:
                System.out.println("Kitab Suci: Alquran");
                System.out.println("Nabi: Muhammad");
                break;
            case Hindu:
                System.out.println("Kitab Suci: Veda");
                System.out.println("Nabi: -");
                break;
            case Budha:
                System.out.println("Kitab Suci: Tripitaka");
                System.out.println("Nabi: Gautama");
                break;
            case Yahudi:
                System.out.println("Kitab Suci: Taurat");
                System.out.println("Nabi: Musa");
                break;
        }
       
                
    }
} 
   
