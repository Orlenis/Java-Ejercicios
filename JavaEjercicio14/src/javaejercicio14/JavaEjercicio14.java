/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio14;

import java.util.Scanner;

/**
 *
 * @author Orlenis Laguna
 */
public class JavaEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double euro;
       // String moneda;
        
        System.out.println("Escriba cantidad en euros");
        euro = leer.nextDouble();
        
        System.out.println("A que moneda lo quiere convertir");
        System.out.println("Dolar");
        System.out.println("Yenes");
        System.out.println("Libra");
        leer.nextLine();
        String moneda = leer.nextLine();
        
        divisa(euro,moneda);
    }
    
    public static void divisa(double euro, String moneda){
        moneda = moneda.toLowerCase();
        switch (moneda) {
            case "dolar":
                System.out.println(euro + " euros a dolar es: " + euro * 1.28611);
                break;
            case "yenes":
                System.out.println(euro + " euros a yenes es: " + euro * 129.852);
                break;
            case "libra":
                System.out.println(euro + " euros a libra es: " + euro * 0.86);
                break;
            default:
                break;
        }
    }
    
}
