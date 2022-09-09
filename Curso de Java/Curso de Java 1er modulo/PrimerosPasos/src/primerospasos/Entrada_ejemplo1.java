/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.time.temporal.TemporalAdjusters;
import java.util.*;

/**
 *
 * @author Adrian
 */
public class Entrada_ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); //DECLARAR VARIABLE DE TIPO OBJETO(osea no es estatico), LLAMADO entrada
        System.out.println("Digite su nombre");
        
        String Nombre_us= entrada.nextLine();
        
        System.out.println("Digite su Edad");
        
        int edad= entrada.nextInt();
        
        System.out.println("hola "+ Nombre_us + " el año que viene tendras "+ (edad+1)+ " años");
                
    }
    
}
