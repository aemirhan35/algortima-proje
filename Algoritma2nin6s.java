/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma2nin6s;

import java.util.Scanner;

/**
 *Klavyeden girilen n sayısına göre ,
 * n ‘e kadar olan sayıların karelerinin toplamını hesaplayan programınJava kodu
 * @author emirhan
 */
public class Algoritma2nin6s {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("bir tam sayı giriniz");
        int a = s.nextInt();
        int karetoplam =0;
        
        for(int x = 1 ;x<=a;x++){
            int b =x*x;
            if(b>0);
            karetoplam = karetoplam +b;
        }System.out.println("sonuç :"+karetoplam);
            
    }
}
