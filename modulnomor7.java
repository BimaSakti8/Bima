package com.mycompany.modul2;
import java.util.Scanner;


public class modulnomor7 {
     public static void main(String[] args) {
         double x,f_x;
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("x(double)=");
         x=keyboard.nextDouble();
         
         f_x = 5 + 6 * x + 8 * Math.pow(x, 2) + 9 * Math.pow(x, 3) + 5 * Math.pow(x, 4);
        
         
         System.out.println("Nilai f(" + x + ") = " + f_x);
        
     }
    
}