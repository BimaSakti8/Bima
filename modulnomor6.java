package com.mycompany.modul2;
import java.util.Scanner;


public class modulnomor6 {
  public static void main(String[] args) {
      double x1,y1,x2,y2,x3,y3,keliling,luas;
       Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan absis titik A (x1): ");
        x1 = scanner.nextDouble();
        System.out.print("Masukkan ordinat titik A (y1): ");
        y1 = scanner.nextDouble();

        
        System.out.print("Masukkan absis titik B (x2): ");
        x2 = scanner.nextDouble();
        System.out.print("Masukkan ordinat titik B (y2): ");
        y2 = scanner.nextDouble();

      
        System.out.print("Masukkan absis titik C (x3): ");
        x3 = scanner.nextDouble();
        System.out.print("Masukkan ordinat titik C (y3): ");
        y3 = scanner.nextDouble();

       
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        
        double AC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        
        
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        
       
        keliling = AB + AC + BC;
        
       
        double s = keliling / 2;
        
        
        luas = Math.sqrt(s * (s - AB) * (s - AC) * (s - BC));
        
       
        System.out.println("Keliling segitiga: " + keliling);
        System.out.println("Luas segitiga: " + luas);
        
        
      
  }
}
   