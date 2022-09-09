/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Condicional_if_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in); // creo un objeto de la clases escanner, ya que esta no es estatica
        System.out.println("Ingrese su edad");
        
        int  edad = entrada.nextInt(); // nextIn porque es un entero el que estoy declarando
        // su syntaxys es, el nombre del objeto que cree en este caso "entrada" . y el metodo que voy a usar de la clases scanner
        //osea el metodo next.In
        
        if (edad >= 18) { // traducido
            // si al edad es mayor o igual que 18
            
            System.out.println("Es mayor de edad"); // imprime que es mayor de edad
            
        }else{ // else = y si no
            
        System.out.println("Es menor de edad");// imprime soy menor de edad, no puede haber un else si un if
        
        }
        
        
    }
    
    
}
