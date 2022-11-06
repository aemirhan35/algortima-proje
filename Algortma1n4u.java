/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma1n4u;

import java.util.Scanner;

/**klavyeden kütlesi,hızı ve yerden yüksekliği girilen maddenin potansiyel ve kinetik enerjisini bulan formül
 *BAŞLA
 * Kullanıcıdan kütle verisini al
 * kullanıcıdan hız verisini al
 * kullanıcıdan yerden yüksekliğinin verisini al
 * potansiyel enerjisi için kültve yüksekliği 10la çarp
 * kinetik enerji için kütle ve hızın karesini çarpıp 2 ye böl
 * ekrana sonucu yazdırınız
 * BİTİR
 * @author emirhan
 */
public class Algortma1n4u {
    //g=10m/s

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("kütlesini giriniz");
        double k =s.nextDouble();
        System.out.println("hızını giriniz");
        double v= s.nextDouble();
        System.out.println("yerden yüksekliğini giriniz");
        double h=s.nextDouble();
        System.out.println("potansiyel enerjisi : "+ k*h*10);
        System.out.println("kinetik enerjisi ;" + (k*v*v)/2);
    }
}
