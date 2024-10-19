package com.mycompany.Modul4;
import java.util.Scanner;


public class Modul4 {
   public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
      
      System.out.println("Bilangan bulat=");
     
      System.out.print("Bilangan= ");
      int bilangan = input.nextInt();
      
      if (bilangan % 2 == 0){
          System.out.println(bilangan+"bilangan genap");
      } else {
          System.out.println(bilangan+"bilangan ganjil");
      }
      
    }  
    
}