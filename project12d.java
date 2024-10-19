/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekbima1;
import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class project12d {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double sa,sb,sc;
        
        System.out.print("Nilai 'a' : ");
         sa = keyboard.nextDouble();
        System.out.print("Nilai 'b' : ");
         sb = keyboard.nextDouble();
        System.out.print("Nilai 'c' : ");
         sc = keyboard.nextDouble(); 
         
         double max = Math.max(sa, Math.max(sb,sc));
         double min1,min2;
         
      if (max == sa) {
          min1 = sb;
          min2 = sc;
      }else if(max == sb){
          min1 = sa;
          min2 = sc;
      }else {
          min1 = sa;
          min2 = sb;
      }
           
     if (max * max == (min1*min1) + (min2*min2)){
         System.out.println("Segitiga Siku-Siku");
     } else if(sa == sb && sb!=sc && sa!=sc || sb==sc && sb!=sa &&
             sa!=sc || sa==sc && sb!=sa && sb!=sc) {
         System.out.println("Segitiga Sama Kaki");
     } else if(sa == sb || sa==sc || sb == sc){
         System.out.println("Segitiga Sama Sisi");
     }else{
         System.out.println("Sefitiga Sembarang");
     }
      
      
    }
}
