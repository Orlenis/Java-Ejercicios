/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio19;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n =3;
        
        int [][] matriz = new int [n][n];
        int [][] matrizT = new int [n][n];
        
       //llenar matriz
       llenarMatriz(matriz, n);
        
                
        //pasar a transpuesta
        transpuesta(matriz, matrizT,  n);
        
        //escribir matriz
       escribirMatriz(matriz,  n);
        
        System.out.println("");
        
        // escribir transpuesta        
        escribirMatriz(matrizT,  n);
        
        System.out.println("");
        
        //comprobar si es anti simetrica
        antiSimetrica(matriz, matrizT,  n);
        
    }
    
    public static void llenarMatriz(int [][] matriz, int n){
         matriz [0][0] = 0;
        matriz [0][1] = -2;
        matriz [0][2] = 4;
        
        matriz [1][0] = 2;
        matriz [1][1] = 0;
        matriz [1][2] = 2;
        
        matriz [2][0] = -4;
        matriz [2][1] = -2;
        matriz [2][2] = 0;
       
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz [i][j] = (int) (Math.random()*20)+1;
            }
        }*/
    }
        
    public static void transpuesta(int [][] matriz, int [][] matrizT, int n){
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizT[j][i] = matriz [i][j];
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
    
    public static void antiSimetrica(int [][] matriz, int [][] matrizT, int n){
        int c = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == matrizT[i][j]*(-1)) {
                    c = c + 1;
                }
            }
        }
        
        if (c==9) {
            System.out.println("Es anti simetrica");
        }else{
            System.out.println("No es anti simetrica");
        }
    }
    
}
