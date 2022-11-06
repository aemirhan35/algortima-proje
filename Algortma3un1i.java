/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortma3un1i;

import java.util.Scanner;

/**Klavyeden girilen pozitif bir a tam sayısının tam bölenlerini hesaplayıp listeleyen program.
 *
 * @author emirhan
 */
public class Algortma3un1i {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("bir sayı giriniz");
        int a =s.nextInt();
       
       for (int  b= 1 ; b <= a ; b ++){
           if(a%b==0){
               System.out.println(b);
           }
                
       }
    }
}
