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
public class For_ejercicio1 {
    
    //programa que valide si un correo tiene un arroba al digitar
    //si es correcto mostrar ese mensaje por pantalla
    // si es incorrecto de la misma manera

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean arroba = false;

        String correo = JOptionPane.showInputDialog("Escriba su correo electronico ");
        //udo de metodos estaticos por ende no creo un objeeto

        for (int i = 0; i < correo.length(); i++) {
            /* desde i=0 hasta la cantidad de letras, que tenga el largo el correo ingresado
            en pasos de uno, osea letra por letra */

            if (correo.charAt(i) == '@') {/* si en el correo se encuentra un arroba
                         arroba se vuelve true  */
                arroba = true;
            }
        }
       
        if (arroba==true) {/*si arroba es igual a true
            imprimir que es correcto*/
           
            System.out.println("Su correo es correcto");
           
        }else{
            System.out.println("Correo invalido");
        }
    }
}
