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
public class project12b {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        
        String gl,nm;
        int mk;
        
        System.out.println("Nama : ");
          gl = keyboard.nextLine();
        System.out.println("Golongan Anda : ");
          gl = keyboard.nextLine();
        System.out.println("Masa Kerja : ");
          mk =keyboard.nextInt();
       
        
        
        if(gl.equalsIgnoreCase("I") && mk <= 10) {
            System.out.println("Mendapat Bonus 50%");
        } else if (gl.equalsIgnoreCase("II") && mk <= 10) {
            System.out.println("Mendapat Bonus 60%"); 
        } else if (gl.equalsIgnoreCase("III") && mk <= 10) {
            System.out.println("Mendapat Bonus 70%");
        } else if (gl.equalsIgnoreCase("IV") && mk <= 10) {
            System.out.println("Mendapat Bonus 80%");
        }
        
        else if(gl.equalsIgnoreCase("I") && mk >= 11 && mk <= 20) {
            System.out.println("Mendapat Bonus 60%");
        } else if (gl.equalsIgnoreCase("II") && mk  >= 11 && mk <= 20) {
            System.out.println("Mendapat Bonus 70%"); 
        } else if (gl.equalsIgnoreCase("III") && mk  >= 11 && mk <= 20) {
            System.out.println("Mendapat Bonus 80%");
        } else if (gl.equalsIgnoreCase("IV") && mk  >= 11 && mk <= 20) {
            System.out.println("Mendapat Bonus 90%");
        }
        
        else if(gl.equalsIgnoreCase("I") && mk >= 21 && mk <= 30) {
            System.out.println("Mendapat Bonus 70%");
        } else if (gl.equalsIgnoreCase("II") && mk  >= 21 && mk <= 30) {
            System.out.println("Mendapat Bonus 80%"); 
        } else if (gl.equalsIgnoreCase("III") && mk  >= 21 && mk <= 30) {
            System.out.println("Mendapat Bonus 90%");
        } else if (gl.equalsIgnoreCase("IV") && mk  >= 21 && mk <= 30) {
            System.out.println("Mendapat Bonus 100%");
        } else {
             System.out.println("Input Tidak Valid");
             return;
         }
         
        
        
    }
}
