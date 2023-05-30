/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio20;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n =3, m = 8;
        
        int [][] matriz = new int [n][n];
        int [] vector = new int [m];
        
        llenarMatriz(matriz, n);
        inicializarVector(vector, m);
        escribirMatriz(matriz, n);
        System.out.println("");
        sumas(matriz, vector, n);
        escribirVector(vector, m);
        System.out.println("");
        magica(vector,  m);
        
        
    }
    
     public static void llenarMatriz(int [][] matriz, int n){
        Scanner leer = new Scanner(System.in); 
        /* 
        matriz [0][0] = 2;
        matriz [0][1] = 7;
        matriz [0][2] = 6;
        
        matriz [1][0] = 9;
        matriz [1][1] = 5;
        matriz [1][2] = 1;
        
        matriz [2][0] = 4;
        matriz [2][1] = 3;
        matriz [2][2] = 8;
       */
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.println("Posicion " + i + "," + j);
                //matriz [i][j] = leer.nextInt();
                matriz [i][j] = (int) (Math.random()*20)+1;
            }
        }
    }
     
     public static void inicializarVector(int [] vector, int m){
         for (int i = 0; i < m; i++) {
             vector[i] = 0;
         }
    }
        
    public static void sumas(int [][] matriz, int [] vector, int n){
        int sumaf = 0, sumad= 0, sumac=0, sumadi=0, k=0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n-1) {
                    
                    //suma de filas
                    sumaf = sumaf + matriz[i][j];
                    vector[k] = sumaf;
                    k = k+1;
                    sumaf = 0;
                }else{
                    sumaf = sumaf + matriz[i][j];
                }   
                
                // suma de diagonal principal
                if (i==j) {
                    sumad = sumad + matriz[i][j];
                    if (i == n-1 &&j == n-1) {
                        vector[k] = sumad;
                        k = k+1;
                    }
                } 
                
                //suma de diagonal secundaria
                if (i+j == 2) {
                    sumadi = sumadi + matriz[i][j];
                    if (i == n-1 && j == 0) {
                        vector[k] = sumadi;
                        k = k+1;
                    }
                } 
            }            
        }
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (i == n-1) {
                    
                    //suma de columas
                    sumac = sumac + matriz[i][j];
                    vector[k] = sumac;
                    k = k+1;
                    sumac = 0;
                }else{
                    sumac = sumac + matriz[i][j];
                }   
                          
            }            
        }
    }
    
    public static void escribirMatriz(int [][] matriz, int n){
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz [i][j] + "|");
            }
            System.out.println("");
        }
    }
    
    public static void escribirVector(int [] vector, int m){
        for (int i = 0; i < m; i++) {
            System.out.print(vector[i]+ "|");
        }
    }
    
    public static void magica(int [] vector, int m){
        int aux = vector[0], c=0;
        for (int i = 0; i < m; i++) {
            if (vector[i] == aux) {
                c = c+1;
            }
        }
        
        if (c == 8) {
            System.out.println("Es magica");
        }else{
            System.out.println("No es magica");
        }
    }
    
}
