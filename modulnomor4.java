package com.mycompany.modul2;
import java.util.Scanner;


public class modulnomor4 {
    public static void main(String[] args) {
        double us1,us2,uas,nilaifinal;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("US 1=");
        us1 = keyboard.nextDouble();
        System.out.print("US 2=");
        us2 = keyboard.nextDouble();
        System.out.print("UAS =");
        uas =keyboard.nextDouble();
        
        nilaifinal = (0.3*us1) + (0.3*us2) + (0.49*uas);
        System.out.print("Nilai Final = "+nilaifinal);
        
    }
    
}
    
