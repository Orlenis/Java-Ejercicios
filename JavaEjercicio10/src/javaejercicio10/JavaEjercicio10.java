/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio10;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         int num, suma = 0, lim;
         
         System.out.println("Escriba un limite positivo");
         lim = leer.nextInt();
         
        do {
            System.out.println("Escriba un numero");
            num = leer.nextInt();
            suma = suma + num;
        } while (suma < lim);
        
        System.out.println("La suma es: " + suma);
        
    }
    
}
