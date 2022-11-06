/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma3un5i;

import java.util.Scanner;

/**
 *Klavyeden metre cinsinden girilen uzunluğu , seçilen birime dönüştüren program.
 * @author emirhan
 */
public class Algoritma3un5i {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
      
        String birim = scanner.nextLine();
        int birimsayisi = scanner.nextInt();
        
       
        String kilometre = "kilometre";
        String hektometre = "hektometre";
        String dekametre = "dekametre";
        String desimetre = "desimetre";
        String santimetre = "santimetre";
        String milimetre = "milimetre";
       if(birim.equals(kilometre)) {
            System.out.println ( birimsayisi / 1000 );
          
       } else if (birim.equals(hektometre)){
             System.out.println ( birimsayisi /  100 );

       } else if (birim.equals(dekametre)){
             System.out.println ( birimsayisi /  10 );
        
       }
       else if (birim.equals(desimetre)){
             System.out.println ( birimsayisi *  10 );
        
       }
       else if (birim.equals(santimetre)){
             System.out.println ( birimsayisi *  100 );
        
       }
       else if (birim.equals(milimetre)){
             System.out.println ( birimsayisi *  1000 );
        
       }
    }
}
