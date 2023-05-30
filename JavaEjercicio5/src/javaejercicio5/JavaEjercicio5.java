/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio5;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         double num, d, t, c;
         
         System.out.println("Escriba un numero");
         num = leer.nextDouble();
         
         d = num * 2;
         t = num * 3;
         c = Math.sqrt(num)  ;
         
         System.out.println("El doble es: " + d + " el triple es: " + t + " el cuadrado es: " + c);
         
    }
    
}
