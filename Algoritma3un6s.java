/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma3un6s;

import java.util.Scanner;

/**Klavyeden girilen pozitif tam sayıyı tersten yazdıran program.
 *
 * @author emirhan
 */
public class Algoritma3un6s {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        System.out.println("bir sayı giriniz");
        int a = s.nextInt();
        
        System.out.print("sayının tersi : ");
        while(a > 0) {

            System.out.print(a % 10);
                        a = a/10;
        }            
        }
        
        
    }
