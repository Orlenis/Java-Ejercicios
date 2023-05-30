/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio4;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         double cent, far;
         
         System.out.println("Escriba grados centigrados");
         cent = leer.nextDouble();
         
         far = 32 + (9 * cent/5);
         
         System.out.println("La temperatura en grados fahrenheit es: " + far);
    }
    
}
