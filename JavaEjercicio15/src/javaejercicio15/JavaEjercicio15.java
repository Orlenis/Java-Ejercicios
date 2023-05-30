/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio15;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [] vector = new int [100];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]); 
        }
    }
    
}
