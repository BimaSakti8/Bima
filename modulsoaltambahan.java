package com.mycompany.modul2;
import java.util.Scanner;


public class modulsoaltambahan {
     public static void main(String[] args) {
         int NT=60000,KST=75000,SK=40000,MC=50000,SKJ=45000,PJ=38000,TB;
         int JNT,JKST,JSK,JMC,JSKJ,JPJ;
          Scanner keyboard = new Scanner(System.in);
         
          System.out.println("        TOKO  JAYA           ");
          
          
         
         System.out.println("=============================="); 
         
         System.out.println("NOTA BAYAR"); 
          
         System.out.print("Jumlah Naastar         = ");
         JNT = keyboard.nextInt();
         System.out.print("Jumlah Kastengel         = ");
         JKST = keyboard.nextInt();
         System.out.print("Jumlah Sus Kering        = ");
         JSK = keyboard.nextInt();
         System.out.print("Jumlah Macaroon          = ");
         JMC = keyboard.nextInt();
         System.out.print("Jumlah Stick Keju       = ");
         JSKJ = keyboard.nextInt();
         System.out.print("Jumlah Permen Jelly      = ");
         JPJ = keyboard.nextInt();
         
         System.out.println("=============================");
          
          TB = (NT*JNT)+(KST*JKST)+(SK*JSK)+(MC*JMC)+(SKJ*JSKJ)+(PJ*JPJ);
           System.out.println("Total Bayar=Rp."+TB);
          
        
     }
}