/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class For_ejercicio3_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado=1;
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        //int numero_n=Integer.parseInt(numero);
        
        for (int i = numero; i > 0; i--) {
            
            
            resultado=resultado*i;
            
        }
        
        System.out.println("El factorial de " + numero + " es igual a " + resultado);
        
    }
    
}
