/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma2n1;

import java.util.Scanner;

/**
 * Klavyeden girilen bir tam sayının pozitif , negatif veya sıfır olduğunu söyleyen
 * programın algoritma java kodu
 *
 *
 * @author emirhan
 */
public class Algortma2n1 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Bir sayı giriniz");
        int a =s.nextInt();
        if (a<0){
        System.out.println("negatiftir");
        }
        else if (a>0){
            System.out.println("pozitiftir");
        }
        else {
            System.out.println("0 dır");
        }
            
        
        }
}
