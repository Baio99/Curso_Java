/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;
import javax.swing.*;
/**
 *
 * @author Adrian
 */

public class Entrada_ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String nombre_usuario=JOptionPane.showInputDialog("Digite su nombre");//se llama a la clase Joption . seguio del metodo ya que es un metodo estatico
     String edad=JOptionPane.showInputDialog("digite su edad");//para convertir ese string en entero, ya que solo permite strings, debo convertir
int edad_nueva=Integer.parseInt(edad);// Lo mismo como es estatico llamo a la calse integer . seguido de su metodo, y ya es un entero ya no un string
     
     System.out.println("Su nombre es "+ nombre_usuario +" su edad en un año sera " + (edad_nueva +1) );
        
        
       
        
   
    }
    
}
