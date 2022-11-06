/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma2n3u;

import java.util.Scanner;

/**Klavyeden 3 kenarı girilen üçgenin eşkenar , ikizkenar 
 * veya çeşitkenar olduğunu söyleyen programın java kodu
 *
 * @author emirhan
 */
public class Algortma2n3u {

    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
       System.out.println("1. kenarı giriniz");
       int a =s.nextInt();
        System.out.println("2.kenarı giriniz");
        int b =s.nextInt();
         System.out.println("3. kenarı giriniz");
       int c =s.nextInt();
       if (a==b && b==c && a==c){
           System.out.println("eşkenar üçgen");
       }
       else if (a!=b && a!=c && b!=c){
           System.out.println("çeşitkenar üçgen");
       }
       else {
           System.out.println("ikizkenar üçgen");
       }
       
    }
}
