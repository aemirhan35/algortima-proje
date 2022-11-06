/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma3un2si;

import java.util.Scanner;

/**Klavyeden girilen n sayısına göre 1’den n’ e kadar tamsayıların toplamını
 *1 den n’ e kadar tek sayıların toplamı
 * 2’ den n’ e kadar çift tam sayıların toplamını hesaplayan program
 * @author emirhan
 */
public class Algoritma3un2si {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("bir sayı giriniz");
        int a = s.nextInt();
     
        int toplam = 0 ;
        int toplam2 = 0;
        int toplam3= 0;
        
        for( int x = 0 ; x <= a ; x ++){
            if(x % 2== 1){
                toplam = toplam + x;
            }
        }
        System.out.println("Teklerin Toplamı "+toplam);
        
        
        for(int y = 1 ; y <= a ; y ++){
            if(y % 2 == 0){
                toplam2 = toplam2 + y;
                
            }
        }
        System.out.println("Çiftlerin Toplamı "+toplam2);
        
        
        for(int z = 1    ; z <= a ; z ++){
            
                toplam3 +=  z;
                
            
        }
        System.out.println("Verilen Sayı Kadar Toplamı "+toplam3);
}}