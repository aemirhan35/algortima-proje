/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortmaodev1n8;

import java.util.Scanner;

/** kullanıcıdan  kenar uzunluğu verilen küpün hacmi ve alanını bulma
 * BAŞLA
 * kullanıcıdan küpün kenar uzunluğu verisini alınız
 * hacmini bulmak için küpün kenar uzunluğunun küpünü alınız
 * alanını bulmak için küpün kenar uzunluğunun karesini 6yla çarp
 * ekrana sonucu yazdırınız
 * BİTİR
 *
 * @author emirhan
 */
public class Algortmaodev1n8 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("küpün kenar uzunluğunu giriniz");
        double a =s.nextDouble();
        System.out.println("Küpün hacmi : " + a*a*a);
        System.out.println("küpün alanı : " + a*a*6);
        
    }
}
