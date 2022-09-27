/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * @author Adrian
 */
public class Matrices_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //metodo 1
         //syntaxys
         /*tipo de dato, corchetes, nombre que deseo darle a la matriz 
         = la palabra (new) y de nuevo el tipo de dato, entre corchetes la cantidad de datos [aqui]*/
        int [] matriz_nueva=new int [5];
        //nombre de la matriz [su posicion]= a el dato que quiero guardar en esa posicion
        matriz_nueva[0]=5; 
        matriz_nueva[1]=15;
        matriz_nueva[2]=25;
        matriz_nueva[3]=35;
        matriz_nueva[4]=45;
        
        //impresion
        // i=0, hasta i que sea menor que 5 porque tengo 4 posiciones, y que sume 1
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("El dato en la posicion "+ i + " es "+ matriz_nueva[i]);
            
        }
        
        //metodo 2
        
        int [] matriz_nueva2={5,4,3,2,1};
        
        for (int i = 0; i < matriz_nueva2.length; i++) {
            
            System.out.println("El dato en la posicion " + i+ " es " + matriz_nueva2[i]);
            
        }
        
        
        
               
        
    }
    
}
