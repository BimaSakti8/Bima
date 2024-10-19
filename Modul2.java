package com.mycompany.modul2;
import java.util.Scanner;

public class Modul2 {

    public static void main(String[] args) {
       int mkn1prg=8000,jmlhmkn,lauk=3000,jmlhlauk,minum=2000,jmlhminum,ht;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Mau berapa porsi nasi sayur = ");
        jmlhmkn = keyboard.nextInt();
        System.out.print("Mau berapa porsi lauknya = ");
        jmlhlauk= keyboard.nextInt();
        System.out.print("Berapa jumlah minuman = ");
        jmlhminum= keyboard.nextInt();
        
        System.out.println("_____________________________");
        
        ht=(mkn1prg*jmlhmkn)+(lauk*jmlhlauk)+(minum*jmlhminum);
        System.out.println("Harga Total= "+ht);
        
               

      
       
    }
}
