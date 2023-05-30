/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio11;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         int num1, num2, opc;
         String resp;
         
         System.out.println("Escriba numero 1");
         num1= leer.nextInt();
         
          System.out.println("Escriba numero 2");
         num2= leer.nextInt();
         
         do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion:");
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1 / num2));
                    break;
                case 5:
                   System.out.println("Esta seguro de salir del programa? S/N");
                   leer.nextLine();
                    resp = leer.nextLine();
                    resp = resp.toUpperCase();
                    if ("S".equals(resp)) {
                        System.out.println("Saliendo del programa");  
                        break;
                    }else{
                        opc = 0;
                        continue;
                    }
                     
                    
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 5);
        
    }
    
   /* public static String respuesta(){
        Scanner leer = new Scanner(System.in);
        
        String r;
        System.out.println("Esta seguro de salir del programa? S/N");
        r = leer.nextLine();
        r = r.toUpperCase();
        return r;
    }*/
    
}
