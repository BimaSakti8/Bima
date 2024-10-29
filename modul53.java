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
public class modul53 {
    public static void main(String[] args) {
        String month;
       
          Scanner keyboard = new Scanner(System.in);
          
        System.out.println("Bulan Apa = ");
        month = keyboard.nextLine();
        
     switch (month) {
        case "januari": System.out.println("31");
                       break;    
        case "februari": System.out.println("28 atau 29");
                       break;              
        case "maret": System.out.println("31");
                       break; 
        case "april": System.out.println("30");
                       break;              
        case "mei": System.out.println("31");
                       break;   
        case "juni": System.out.println("30");
                       break; 
        case "juli": System.out.println("31");
                       break; 
        case "agustus": System.out.println("31");
                       break;              
        case "september": System.out.println("30");
                       break; 
        case "oktober": System.out.println("31");
                       break; 
        case "november": System.out.println("30");
                       break;                
        case "desember": System.out.println("31");
                       break; 
        default:  System.out.println("Invalid month");
                 break;               
     }  
         System.out.print("hari");
    }
}
