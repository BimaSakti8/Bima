/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.modul51;

import java.util.Scanner;

/**
 *
 * @author M S I
 */
public class Modul51 {

    public static void main(String[] args) {

        double a, b, c, D, x1, x2;
        Scanner dataKuadrat = new Scanner(System.in);

        System.out.println("Koefisien x2 (a): ");
        a = dataKuadrat.nextDouble();
        System.out.println("Koefisien x2 (b): ");
        b = dataKuadrat.nextDouble();
        System.out.println("Koefisien x2 (c): ");
        c = dataKuadrat.nextDouble();

        D = b * b - (4 * a * c);

        if (D < 0 || a == 0) {
            System.out.println("Tidak Mempunyai Akar Nyata");
        } else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Akarnya tunggal yakni:" + x1);
        } else {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Akar Pertama:" + x1);
            System.out.println("Akar Kedua:" + x2);
        }

    }
}
