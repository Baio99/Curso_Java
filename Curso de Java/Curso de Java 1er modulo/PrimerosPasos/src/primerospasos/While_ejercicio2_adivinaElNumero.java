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
public class While_ejercicio2_adivinaElNumero {
    
    /*Haga un programa que genere un numero entero del 1 al 100 sin que se vea, 
    y que el usuario adivine ese numero, que nos inidicque en cuantos intentos se obtuvo*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0;
        int contador=0;// inicializo el contador
        int aleatorio=(int)(Math.random()*100);/*el metodo random de la clase math devuelve un double pero
        como el enunciado me pide numeros enteros, toca hacer refundicion osea convertir de un tipo de dato numerico
        a otro tipo de dato, por eso el (int) antes del math, aparte el metodo random de la clase math, me da
        numeros aleatorios desde el 0 al 1 positivos, para correguir esto multiplico por 100 para obtener del 1 al 100
        */
        
        Scanner entrada= new Scanner(System.in);/* creo un objeto ya que la clase scanner no es estatica, esto hace que
        en la consola me pida un numero, por esl el System.in*/
        
        while (aleatorio!=numero) {// traducido, mientras aleatorio !sea diferente que! numero
            
            contador++; // va sumando las iteraciones
            System.out.println("Ingrese un numero :");                                 // hacer todo esto
            
            numero=entrada.nextInt();/*rehuso la variable numero que inicialice con 0, ahora para que el usuario le de 
            un valor y como es entero el . nextin*/
            
            if (aleatorio>numero) { // traducido, si aleatorio es mayor que numero
                
                System.out.println("El numero a adivinar es mayor "); // me imprime este mensaje       
            }
            else if(aleatorio<numero){// traducido, si aleatorio es menorr que numero
                
                System.out.println("El numero a adivinar es menor ");// me imprime este mensaje
            }       
        } System.out.println("Correcto, adivinaste en " + contador + " intentos");/* me imprime este mensaje 
        cuando ya se cumpla el while y se sale*/ 
    }
    
}
