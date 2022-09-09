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
public class Entrada_numeros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String numero = JOptionPane.showInputDialog("Ingrese el numero");
        
        double numero_c=Double.parseDouble(numero);// es un metodo estatico por ello se le llama a la calse dobule. seguido del meetodo
        
                
        System.out.println("la raiz del numero " + numero + "es" );
        System.out.printf( "%1.3f",Math.sqrt(numero_c));
        
        
     
    }
    
}
