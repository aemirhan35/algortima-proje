/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma2nin6si;

import java.util.Scanner;

/**
 *
 * @author emirhan
 */
public class Algoritma2nin6si {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a =s.nextInt();
        int b = 0;
        int toplam = 0;
        for (b=0;b<=a;b++){
        toplam=toplam+b*b;
        
        }System.out.println("Sonuç : "+toplam);
    }
}
