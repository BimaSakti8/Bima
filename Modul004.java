/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul004;

import java.util.Scanner;

/**
 *
 * @author M S I
 */
public class Modul004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Untuk memasukan bilangan bulat
        int bilAngka;
        //untuk melakukan input data dari keyboard
        Scanner keyboard = new Scanner(System.in);
        //untuk mencetak line
        System.out.println("Masukan bilangan bulat = ");
       //untuk mengambil nilai int
        bilAngka = keyboard.nextInt();
        //untuk mengeksekusi kode jika kondisi bernilai benar
        if(bilAngka % 2 == 0) {
            System.out.println(bilAngka + "bilangan genap");
        //untuk mengeksekusi kode jika kondisi bernilai salah
        } else {
            System.out.println(bilAngka +"bilangan ganjil");
        }
    }
    
}
