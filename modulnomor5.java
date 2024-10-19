package com.mycompany.modul2;
import java.util.Scanner;


public class modulnomor5 {
     public static void main(String[] args) {
         double tinggi,beratideal;
         String nama;
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Nama:");
          nama=keyboard.nextLine();
          System.out.println("tinggi badan:");
          tinggi=keyboard.nextDouble();
          
          beratideal = tinggi-100;
          System.out.print("Berat Ideal = "+beratideal +"Kg");
         
     }
}
   
