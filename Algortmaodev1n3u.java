/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortmaodev1n3u;

import java.util.Scanner;

/**klavyeden yarı çapı girilen kürenin hacmini ve alanını bulan program
 *BAŞLA
 *Kullanıcıdan kürenin yarıçapı verisini al
 *Kürenin hacmi için kürenin yarıçapının küpünü 4 le çarp
 *kürenin alanı için kürenin yarıçapının karesini 12yle çarp
 * ekrana sonucu yazdırınız
 *BİTİR
 * @author emirhan
 */
public class Algortmaodev1n3u {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("kürenin yarıçapını giriniz");
        double a = s.nextDouble();
        // pi =3
        System.out.println("kürenin hacmi :"+ a*a*a*4);
        System.out.println("kürenin alanı : "+ a*a*12);
    }
}
