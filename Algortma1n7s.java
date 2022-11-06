/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma1n7s;

import java.util.Scanner;

/**kullanıcıdan 2 kenarı girilen dikdörtgenin alanı ve çevresi
 * BAŞLA
 * kullanıcıdan 1. kenarın verisini al
 * kullanıcıdan2.kenarın verisini al
 * alanı bulmak için 1. ve 2. kenarı çarp
 * çevresini bulmak için 1.ve 2. kenarı toplayım 2yle çarp
 * ekrana sonucu yazdırınız
 * BİTİR
 *
 * @author emirhan
 */
public class Algortma1n7s {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("dikdörtgenin 1. kenar uzunluğunu giriniz");
        double a =s.nextDouble();
        System.out.println("dikdörtgenin 2. kenar uzunluğunu giriniz");
        double b = s.nextDouble();
        System.out.println("alanı :"+ a*b);
        System.out.println("çevresi : "+ (a+b)*2);
        
    }
}
