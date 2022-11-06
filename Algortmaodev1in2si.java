/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortmaodev1in2si;

import java.util.Scanner;

/**klavyeden derece cinsinden girilen açıyı radyan ve gradyan cinsine çeviren program
 *BAŞLA
 *Kullanıcıdan derece verisini alınız
 *Drece cinsini radyan cinsine çevirmek için dereceyi 60a böl
 * ekrana sonucu yazdırınız
 * Bitir
 *
 * @author emirhan
 */
public class Algortmaodev1in2si {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("dereceyi giriniz");
        //pi=3
    double a = s.nextDouble(); 
    System.out.println("Radyna : "  + a/60);
    
}
}