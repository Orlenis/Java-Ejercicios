/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int num1, num2, suma;
       
        System.out.println("Numero 1");
        num1 = leer.nextInt();
        
        System.out.println("Numero 2");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma es: " + suma);
       
    }
    
}
