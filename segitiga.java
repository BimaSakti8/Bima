package com.mycompany.modul2;
import java.util.Scanner;


public class segitiga {
     public static void main(String[] args) {
         double alas,tinggi,SM;
         Scanner keyboard = new Scanner(System.in);
         
          System.out.print("Masukkan alas: ");
           alas=keyboard.nextDouble();
         System.out.print("Masukkan tinggi: ");
         tinggi=keyboard.nextDouble();
         
          System.out.println("________________________");
         
         
         SM = Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
          System.out.print("Sisi Miring: "+SM);
         
     }
}