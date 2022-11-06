/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortmaodev1;

import java.util.Scanner;

/**Kullanıcıdan kenar uzunluğu ve o kenara ait yüksekliği girilen üçgenin alanını bulan program
 *BAŞLA
 *Kullanıcıdan üçgenin kenar uzunluğu verisini alınız
 *Kullanıcıdan bu kenara ait dik uzunluğu verisini alınız
 *Üçgenin alanını bulmak için kenar uzunluğu ve dik uzunluğu çarpıp 2ye bölünüz
 *ekrana sonucu yazdırınız
 *Bitir
 * @author emirhan
 */
public class Algortmaodev1 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("üçgenin kenar uzunluğunu giriniz");
        double a =s.nextDouble();
        System.out.println("bu kenara ait dik uzunluğu giriniz");
        Double b =s.nextDouble();
        System.out.println(""+(a*b)/2);
    }
}
