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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean arroba = false;

        String correo = JOptionPane.showInputDialog("Escriba su correo electronico ");

        for (int i = 0; i < correo.length(); i++) {

            if (correo.charAt(i) == '@') {

                arroba = true;

            }

        }
        
        if (arroba==true) {
            
            System.out.println("Su correo es correcto");
            
        }else{
            System.out.println("Correo invalido");
        }
    }

}
