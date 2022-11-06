/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma2nn4u;

import java.util.Scanner;

/**Klavyeden n sayısı alınacak n sayısına göre
 * tek sayıların toplamını bulan programın java kodu
 * @author emirhan
 */
public class Algortma2nn4u {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
          System.out.println("bir sayı giriniz");
          int a =s.nextInt();
          int b = 0;
          int toplam = 0;
          for (b=0; b<=a;b++){
           if (b%2==1){
               toplam = toplam +b;
           }
          }System.out.println("Sonuç :"+toplam);
        
    }
}
