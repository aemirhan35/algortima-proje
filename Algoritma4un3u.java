/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritma4un3u;

import java.util.Scanner;

/**
 *
 * @author emirhan
 */
public class Algoritma4un3u {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
            System.out.println("Bir sayı giriniz");
           int  a = s.nextInt();
            for (int x=1;x<a;x++){
                for(int y =1;y<x;y++){
                  if(a ==  (x * x) + (y *y)){
                    System.out.println("Eşittir");
                }
            }
            
             
  
            
        
        
    }
        
    }  
    }
        
    

