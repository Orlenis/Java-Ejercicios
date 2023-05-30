/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio16;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Escriba tamaño del vector");
        int n = leer.nextInt();
        int num, cont = 0;
        
        int [] vector = new int [n];
 
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*20)+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " " ); 
        }
        System.out.println("");
        System.out.println("Que numero desea buscar en el vector?");
        num = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                System.out.println("El numero esta en la posicion " + i);
                cont = cont +1;
            }
        }
        System.out.println("");
        if (cont == 0) {
            System.out.println("El numero no se encontró");
        }else{
            System.out.println("El numero se encontro " + cont + " veces");
        } 
        
    }
    
}
