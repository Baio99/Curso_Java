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
public class Do_while_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String genero= "";
        
        do {
            
            genero=JOptionPane.showInputDialog("Ingrese su genero (H/M)");

            
            
        } while (genero.equalsIgnoreCase("H")==false &&genero.equalsIgnoreCase("M")==false);
        
        String altura=JOptionPane.showInputDialog("Ingrese su altura en cm");
        
        int altura_n=Integer.parseInt(altura);
        
        int pesoIdeal1;
        int pesoIdeal2;
        
        if (genero.equalsIgnoreCase("H")) {
            
            pesoIdeal1=altura_n-110;
            
            System.out.println("tu peso ideal es: " +pesoIdeal1+ "kg");
            
            
            
            
        }
        else if (genero.equalsIgnoreCase("M")) {
            
            pesoIdeal2=altura_n-120;
            System.out.println("tu peso ideal es: " +pesoIdeal2+ "kg");
            
        }
        
    }
    
}
