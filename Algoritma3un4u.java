/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma3un4u;

import java.util.Scanner;

/**İşaret ( signum ) fonksiyonu” nun tanımına göre klavyeden girilen x değeri için 
f(x) =x^2 -5x+3 fonksiyonunun işaretini hesaplayan program
 *
 * @author emirhan
 */
public class Algoritma3un4u {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("x değerini giriniz");
        int x = s.nextInt();
        int fonk= x*x-5*x+3;
        if (fonk<0){
            System.out.println("işareti negatiftir");
        }
        else if (fonk>0){
            System.out.println("işareti pozitiftir");
        }
        else {
            System.out.println("sıfırdır");
        }
        
    }
}
