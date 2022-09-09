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
        
        if (edad<=18) {// traducido mira a ver si edad es mayor o igual que 18, y si es verdad me ejcuta esto
            
             // traducido si la edad es mayor que 18 imprime eres adolecente e ignora todo lo demas
            //Si esta condicion es falsa, si eddad es mayor que 18, salta a la siguiente condicion osea al else if
            System.out.println("Eres adolecente");
            
        }
        
        else if(edad<=40){ // traducido, y si no mira a ver que es menor o igual que 40
            
            // si estas condicion es verdadera, me imprime "eres joven", e ignora lo demas
            // si esta condicion es falsa, pasa a la siguiente condicion osea alsiguiente else
            
            System.out.println("Eres joven");
             
       
        }
        else if (edad <= 65) { // traducido, y si no mira a ver que es menor o igual que 65
            
            // si estas condicion es verdadera, me imprime "eres maduro", e ignora lo demas
            // si esta condicion es falsa, pasa a la ultima condicion el esle y cierra el if
            
            System.out.println("Eres maduro");
            
        }
        else{ // traducido, y si nada de lo anterior es verdad, ejecutar lo que esta adentro del else
            
            System.out.println("Estas un adulto mayor");
        }
{
        
        }
        
        
        
    }
    
    
}
