package com.mycompany.modul2;
import java.util.Scanner;

public class modulnomor3 {
   
    public static void main(String[] args) {
        double tugas1=7,tugas2=8,tugas3=9,nilairatarata=8;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("tugas1=");
        tugas1 = keyboard.nextInt();
        System.out.print("tugas2=");
        tugas2 = keyboard.nextInt();
        System.out.print("tugas3=");
        tugas3 = keyboard.nextInt();
        
        nilairatarata = (tugas1+tugas2+tugas3)/3;
        System.out.print("Nilai rata rata = "+nilairatarata);
        
    }
    
}
