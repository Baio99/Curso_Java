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
public class While_ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clave= "Adrian";// declaro mi string de la clave con la que voy a comparar si es igual
        String pass=" ";//declaro una variable vacia, que luego sera llenada
        
        while (clave.equals(pass)==false) {// equals metodo que compara dos cadenas ( con mayusculas y minusculas) y me devuelve con true o false
            
            pass = JOptionPane.showInputDialog("Digite la contraseña");// resuso la variable declarada anteriormente que estaba vacia
            // para que el usuario ahora le de una cadena al momento que ingrese la contrasseña
            
            if (pass.equals(clave)==false) {// compara con el metodo equals, las cotraseñas, si comparo las dos cadenas y es falso
                
                
                System.out.println("Contraseña incorrecta");// imrpimo contraseña incorrecta
                
            }

            
            
        }
        
        System.out.println("Contraseña correcta ");// imprimo contraseña conrrecta y salgo del bucle while  
    }
    
}
