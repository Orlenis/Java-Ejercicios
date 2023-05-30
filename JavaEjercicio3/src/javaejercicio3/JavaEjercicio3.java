/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio3;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Escriba una frase");
         String frase = leer.nextLine();
         
         System.out.println("La frase en mayuscula es: " + frase.toUpperCase());
         System.out.println("La frase en minuscula es: " + frase.toLowerCase());
    }
    
}
