/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        
        System.out.println("Ingrese la cantidad de euros"); 
        double euros = leer.nextDouble();
        
        System.out.println("Ingrese la moneda a convertir: \nDOLAR \nYENES \nLIBRAS ");
        String monedaDestino = leer.next();
        
        conversor(euros,monedaDestino);
        
  
        
    }
    
    
    public static void conversor(double eur, String moneda){
           
    
        switch (moneda)
        {
            case "DOLAR": System.out.println("El cambio en dolar es = "+(eur*1.28));
            break;
            case "YENES": System.out.println("El cambio en yenes es = "+(eur*129.85));
            break;
            case "LIBRAS": System.out.println("El cambio en libras es = "+(eur*0.86));
            break;
            default: System.out.println("Introdujo una opción incorrecta");
                      
        }
      
        
        
    
    }
    
}
