/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma1n6s;

import java.util.Scanner;

/**Kullanıcıdan bir kenarı girilen karenin alanı ve çevresini bulan program
 * BAŞLA
 * kullanıcıdan karenin kenar uzunluğu verisini al
 * karenin alanını bulmak için kenarın karesini al
 * karenin çevresini bulmak için kenarı 4 le çarp
 * BİTİR
 * 
 *
 * @author emirhan
 */
public class Algortma1n6s {

    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.println("karenin kenar uzunluğunu giriniz");
        double a =s.nextDouble();
        System.out.println("karenin alanı : "+a*a);
        System.out.println("karenin çevresi : "+4*a);
    }
}
