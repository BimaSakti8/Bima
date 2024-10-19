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
public class project12c {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         String nm,almt;
         int tl,bl;
         
         System.out.println("Nama : ");
         nm = keyboard.nextLine();
         System.out.println("Alamat : ");
         almt = keyboard.nextLine();
         System.out.println("Tanggal Lahir : ");
         tl = keyboard.nextInt();
         System.out.println("Bulan Lahir : ");
         bl = keyboard.nextInt();
         String zodiac=""; 
         String sifat="";
         
         if ((bl==1&&tl>=20 && tl<=30) || (bl==2 && tl<=18)) {
         zodiac="Aquarius";
         sifat="Mandiri,inovatif,dan intelektual";
        }else if ((bl==2&&tl>=19 && tl<=29) || (bl==3 && tl<=20)) {
          zodiac="Pieces";
          sifat="Ramah,Tidak Mementingkan Diri sendiri,dan Intuitif";
        }else if ((bl==3&&tl>=21 && tl<=30) || (bl==4 && tl<=19)) {
          zodiac="Aries";
          sifat="Energic,Aktif,dan berani";
        }else if ((bl==4&&tl>=20 && tl<=31) || (bl==5 && tl<=20)) {
          zodiac="Taurus";
          sifat="Penyabar,Bisa diandalkan,Setia";
        }else if ((bl==5&&tl>=21 && tl<=30) || (bl==6 && tl<=20)) {
          zodiac="Gemini";
          sifat="Penyayang dan Penuh Rasa Penasaran";
        }else if ((bl==6&&tl>=21 && tl<=31) || (bl==7 && tl<=22)) {
          zodiac="Cancer";
          sifat="Setia,Imajinatif,dan Simpatik";
        }else if ((bl==7&&tl>=23 && tl<=30) || (bl==8 && tl<=22)) {
          zodiac="Leo";
          sifat="Mempunyai Sifat Pemimpin,Dramatis,dan Berani";
        }else if ((bl==8 && tl>=23) || (bl==9 && tl<=22)) {
          zodiac="Virgo";
          sifat="Pekerja Keras,Sangat Berhati-Hati,dan Pekerja Keras";
        }else if ((bl==9 && tl>=23) || (bl==10 && tl<=22)) {
          zodiac="Libra";
          sifat="Koperatif,Berpikiran Adil,dan Cinta Damai";
        }else if ((bl==10 && tl>=23) || (bl==11 && tl<=21)) {
          zodiac="Scorpio";
          sifat="Cerdas,Berani,dan Tertutup";
        }else if ((bl==11 && tl>=22) || (bl==12 && tl<=21)) {
          zodiac="Sagitarius";
          sifat="Bebas,Optimis,dan Berjiwa Petualang";
        } else {
             System.out.println("Input Tidak Valid");
        }
         
         System.out.println("Anda Berbintang : "+zodiac);
         System.out.println("Sifat Anda : "+sifat);
    }
 
}
