/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio7;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Escriba la frase");
         String frase = leer.nextLine();
         
         if (frase.equals("eureka")) {
             System.out.println("Correcto");
        }else {
             System.out.println("Incorecto");
         }
         
         // ejercicio 8
         System.out.println("Escriba la frase");
         String frase2 = leer.nextLine();
         
         if (frase2.length()==8) {
            System.out.println("Correcto");
        }else {
             System.out.println("Incorecto");
         }
         
         //ejercicio 9
         System.out.println("Escriba la frase");
         String frase3 = leer.nextLine();
         
         String c = frase3.substring(0,1);
         System.out.println(c);
         
         if (c.equals("A")) {
            System.out.println("Correcto");
        }else {
             System.out.println("Incorecto");
         }
    }
    
}
