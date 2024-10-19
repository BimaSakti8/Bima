/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts1;
import java.util.Scanner;//Untuk membaca perintah scanner
/**
 *
 * @author M S I
 */
public class UTS1 {//Untuk mendeklarasikan class

    public static void main(String[] args) { 
       String nama;//untuk menampung variabel huruf atau karakter
       int nim,pilihan;//untuk menampung variabel bilangan bulat
       double celcius,fahrenheit,reamur;//untuk menampung variabel bilangan real
       
       Scanner keyboard = new Scanner(System.in);//Untuk menerima masukan pengguna dari keyboard
       
        System.out.println("Program Konversi Suhu Oleh  :  ");//untuk mencetak line
        System.out.print("Nama  :  ");//untuk mencetak kalimat
        nama = keyboard.nextLine();//untuk mengembalikan variabel string
        System.out.print("Nim   :  ");//untuk mencetak kalimat
        nim = keyboard.nextInt();//untuk mengembalikan variabel int
        
        System.out.println("Menu  :  ");//untuk mencetak line menu
        System.out.println("1.Celcius");//untuk mencetak line pilihan ke 1
        System.out.println("2.Fahrenheit");//untuk mencetak line pilihan ke 2
        System.out.println("3.Reamur");//untuk mencetak line pilihan ke 3
        
        System.out.println("Pilih ? 1");//untuk mencetak line
        pilihan = keyboard.nextInt();//untuk mengembalikan variabel int
        
        if(pilihan == 1){//untuk permisalan masalah suatu perintah jika bernilai benar
          System.out.print("Masukan Suhu Celcius     :  ");//untuk mencetak kalimat
          celcius = keyboard.nextDouble();//untuk mengembalikan nilai variabel double
          reamur = (4*celcius)/5;//rumus perhitungan celcius ke reamur
          System.out.println("Suhu Reamur = "+reamur);//untuk mencetak line
          fahrenheit = ((celcius*9)/5)+32;//rumus perhitungan celcius ke fahrenheit
        }else if(pilihan == 2){//untuk permisalan masalah suatu perintah jika nilai if bernilai salah
          System.out.print("Masukan Suhu Fahrenheit  :  ");//untuk mencetak kalimat
          fahrenheit = keyboard.nextDouble();//untuk mengembalikan nilai variabel double
          celcius = ((fahrenheit - 32)* 5)/9;//rumus perhitungan fahrenheit ke celcius
          System.out.println("Suhu Celcius = "+celcius);//untuk mencetak sebuah line 
          reamur = ((fahrenheit - 32)*4)/9;//rumus dari fahrenheit ke reamur
          System.out.println("Suhu Reamur = "+fahrenheit);//untuk mencetak sebuah line
        }else if(pilihan == 3){//untuk permisalan masalah suatu perintah jika else if yang pertama bernilai salah
          System.out.println("Masukan Suhu Reamur    : ");//untuk mencetak sebuah line
          reamur = keyboard.nextDouble();//untuk mengembalikan nilai variabel double
          celcius = (5*reamur)/4;//rumus untuk menghitung dari celcius ke fahrenheit
          System.out.println("Suhu Celcius = "+celcius);//untuk mencetka sebuah line
          reamur = (9*reamur+32)/4;//runus untuk menghitung dari fahrenheit
          System.out.println("Suhu Reamur = "+reamur);//untuk mencetak line
          
        }else{//permisalan masalah suatu perintah jika if dan else if bernilai salah
         System.out.println("Masukan Salah");//untuk mencetak line
        }
    }
}
  
        
        
       
       
       
       
       
   