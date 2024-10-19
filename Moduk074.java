/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul004;
import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class Moduk074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//untuk menerima masukan pengguna dari scanner
        int b1,b2,b3;
        
       Scanner keyboard = new Scanner(System.in); //untuk menerima masukan pengguna dari keyboard
       
        // Memasukkan tiga bilangan
        System.out.print("Bilangan ke 1: ");
        b1 = scanner.nextInt();//untuk mengembalikan nilai int
        
        System.out.print("Bilangan ke 2: ");
        b2 = scanner.nextInt();
        
        System.out.print("Bilangan ke 3: ");
        b3 = scanner.nextInt();
        
        if(b1 <= b2 && b2 <= b3){//untuk mengeksekusi kode jika kondisi bernilai benar
            System.out.println("Urutan Terkecil:" + b1 +"," + b2 +"," + b3);
        }else if(b1 <= b3 && b3 <= b2){//untuk mengeksekusi kode jika kondisi pada if tidak memenuhi
            System.out.println("Urutan Terkecil:" + b1 +"," + b3 +"," + b2);
        }else if(b2 <= b1 && b1 <= b3){
            System.out.println("Urutan Terkecil:" + b2 +"," + b1 +"," + b3);
        }else if(b2 <= b3 && b3 <= b1){     
            System.out.println("Urutan Terkecil:" + b2 +"," + b3 +"," + b1);
        }else if(b3 <= b1 && b1 <= b2){    
            System.out.println("Urutan Terkecil:" + b3 +"," + b1 +"," + b2);
        }else{ //untuk mengeksekusi kode jika kondisi bernilai salah
            System.out.println("Urutan Terkecil:" + b3 +"," + b2 +"," + b1);
        }
        
    }
}
