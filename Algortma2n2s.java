/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma2n2s;

import java.util.Scanner;

/**
 *1 ve 7 arasında bir tam sayı girilecek bu tam sayıya göre
 * haftanın ilgili gününü yazdıran programın java kodu
 * @author emirhan
 */
public class Algortma2n2s {

    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       System.out.println("1 ile 7 arasında bir sayı giriniz");
       int a =s.nextInt();
       
      
      if(a == 1){
          System.out.println("Pazartes");
      } else if (a == 2){
          System.out.println("Sali");
      }else if (a == 3){
          System.out.println("Çarsamba");
          
      }else if (a == 4){
          System.out.println("Perşembe");
      }else if (a == 5){
          System.out.println("Cuma");
      }else if (a == 6){
          System.out.println("Cumartesi");
      }else if (a == 7){
          System.out.println("Pazar");
      }else {
          System.out.println("Lütfen 1 ile 7 Arasında Geçerli Sayı Giriniz");
      }
          
    }
}
