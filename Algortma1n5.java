/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma1n5;

import java.util.Scanner;

/**klavyeden bir iletkenin direnci ile akımı girildiğinde uçlarındaki gerilimi hesaplayan prgoram
 * 
 * BAŞLA
   Kullanıcıdan iletken direnci verisini al.
   Kullanıcıdan iletken akım verisini al.
   Gerilimi bulmak için girilen direnc ve akımı carp
   ekrana sonucu yazdırınız
   *BİTİR
 * @author emirhan
 */
public class Algortma1n5 {

    
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("iletkenin direncini giriniz");
        double a = s.nextDouble();
        System.out.println("akımı giriniz");
        double b =s.nextDouble();
        System.out.println("Gerilim : "+ a*b);
    }
}
