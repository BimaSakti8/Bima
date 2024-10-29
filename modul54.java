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
public class modul54 {
    public static void main(String[] args) {
       
 
     Scanner scanner = new Scanner(System.in);
     
       System.out.print("Masukkan ukuran kaos (S, M, L, XL, XXL): ");
        String size = scanner.nextLine();

       
        System.out.print("Masukkan jumlah kaos yang dibeli: ");
        int jmlhk = scanner.nextInt();
        
        int hperk;
            
        
      switch (size) {
            case "S":
                hperk = 30000; 
                break;
            case "M":
                hperk = 38000; 
                break;
            case "L":
                hperk = 45000; 
                break;
            case "XL":
                hperk = 50000; 
                break;
            case "XXL":
                hperk = 60000;
            default:
                System.out.println("Ukuran kaos tidak valid.");
                return;
                
        }
  
           int ht = hperk * jmlhk; 
           
           System.out.println("Total yang harus dibayarkan: Rp " + ht);
    }
 
     
     
}
