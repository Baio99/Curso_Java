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
public class For_each_ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar una matriz de tipo String, llamada paises, y de tamaño de 8
        String [] paises = new String [8];
        /*un for 
        inicia desde 0, hasta el tamaño de paises osea 8, en pasos de 1
        */
        for (int i = 0; i < paises.length; i++) {
            
            /*Inicio que se guarde los datos en paises posicion 0, un cuadro de ingreso de datos
            el i+1 es para que la ventana muestre desde el 1 no desde el 0*/
            paises [i]= JOptionPane.showInputDialog("Digite el pais " + (i+1));            
        }
        /*for each, el tipo de dato de la matriz, una variable (culquiera), dos puntos :, el nombre de la matriz*/
        for(String paisesI:paises){
            
            System.out.println("pais " + paisesI);
            
        }
    }
    
}
