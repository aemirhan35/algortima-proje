/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma2nn5i;

import java.util.Scanner;

/**
 *Klavyeden girilen 2 pozitif tam sayıyı çarpma operatörü kullanmadan çarpan programın java kodyu  
 *
 * 
 * @author emirhan
 */
public class Algortma2nn5i {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int a = s.nextInt();
        System.out.println("2.sayıyı giriniz");
        int b= s.nextInt();
        int sonuc = 0;
        
        
        for(int x = 0 ; x < a; x ++){
            sonuc += b;
            
                 
        }
             
        System.out.println("sonuç ;"+sonuc);
    }
}
