package com.mycompany.modul2;
import java.util.Scanner;


public class modul2nomor2 {
    public static void main(String[] args) {
        double hargabarang=5000,jumlahbarang=2,discount=20/100,hargasetelahdiscount;
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("Harga barang = ");
         hargabarang = keyboard.nextInt();
         System.out.print("Mau brapa jumlah barang = ");
         jumlahbarang =  keyboard.nextInt();
         discount = (hargabarang*jumlahbarang*20)/100;
         System.out.println("Discount = "+discount);
         
         hargasetelahdiscount=(hargabarang*jumlahbarang)-discount;
         System.out.println("Harga Setelah Discount= "+hargasetelahdiscount);
    }
}
