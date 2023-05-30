/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio17;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int d=0, c1=0, c2=0, c3=0, c4=0, c5=0 ;
        
        System.out.println("Escriba tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*20000)+1;
        }
        
       /* for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " " ); 
        }*/
        
        System.out.println("");
                
        System.out.println((int)(Math.log10(vector[3])+1));
        
        for (int i = 0; i < n; i++) {
            d = (int)(Math.log10(vector[i])+1);
            
            switch (d){
                case 1:
                    c1 = c1 + 1;
                    break;
                case 2:
                    c2 = c2 + 1;
                    break;
                case 3:
                    c3 = c3 + 1;
                    break;
                case 4:
                    c4 = c4 + 1;
                    break;
                case 5:
                    c5 = c5 + 1;
                    break;
            }
        } 
        
        System.out.println("1 digito: " + c1);
        System.out.println("2 digitos: " + c2);
        System.out.println("3 digitos: " + c3);
        System.out.println("4 digitos: " + c4);
        System.out.println("5 digitos: " + c5);
    }
    
}
