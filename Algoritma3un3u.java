/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma3un3u;

import java.util.Scanner;

/**
 *  *Klavyeden eleman sayısı girilen bir kümenin belirtilen kombinasyonlarının sayısını hesaplayan program.

 * @author emirhan
 */
public class Algoritma3un3u {

    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.println("Kümenin eleman sayısını giriniz");
        int n = s.nextInt();
        System.out.println("kaçlı kombinasyon yapılcağını giriniz");
        int r = s.nextInt();
        int faktoriyel = 1 ;
        int faktoriyel2 = 1;
        
        
        
        for(int x = 1 ; x <= r ; x++ ){
            faktoriyel = faktoriyel * x ; 
        }
        //System.out.println(faktoriyel);
       
        
        for(int y = 1 ; y <= n ; y++ ){
            faktoriyel2 = faktoriyel2 * y ; 
        }
        //System.out.println(faktoriyel2);
    
        
        
        int faktoriyelfarki =  n -r ;
        
        
        for (int z = 1 ; z < faktoriyelfarki ; z ++){
            
            faktoriyelfarki = z * faktoriyelfarki;
        }
           //System.out.println(faktoriyelfarki);
           
           
           
           
           int  k = faktoriyel2  / (faktoriyel * faktoriyelfarki);
           System.out.println("Sonuc" + k);
    }
    
    
    
}
