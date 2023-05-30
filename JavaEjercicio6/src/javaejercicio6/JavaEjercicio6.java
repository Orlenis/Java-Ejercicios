/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio6;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Escriba un numero");
         int num = leer.nextInt();
         
         if (num % 2 == 0) {
             System.out.println("El numero es par");
        }else{
             System.out.println("El numero es impar");
         }
    }
    
}
