/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio12;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String cadena;
        int correctas = 0, incorrectas = 0;
        
        
        do {
            System.out.println("Escriba su cadena");
            cadena = leer.nextLine();
            
           
            
            if (!"&&&&&".equals(cadena)) {   
                if (cadena.length() >= 2 && cadena.length() <= 5) {
                    if ("X".equals(cadena.substring(0,1)) && "O".equals(cadena.substring(cadena.length()-1))) {
                        correctas = correctas+1;
                    }else{
                        incorrectas = incorrectas+1;
                    } 
                }else{
                    incorrectas = incorrectas+1;
                }
            }
            
        } while (!"&&&&&".equals(cadena));
        
        System.out.println("Cantidad de cadenas correctas: " + correctas);
        System.out.println("Cantidad de cadenas incorrectas: " + incorrectas);
    }
    
}
