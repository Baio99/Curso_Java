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
public class For_Each_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    //imprimir una matriz de paises con for each 
    public static void main(String[] args) {
        
        //declarar e inicializar una matriz
        
        String [] paises = {"Ecuador","peru","francia","egipto","mexico"};
        /*
        Usar for each 
        tipo de dato que se uso en la matriz, declarar una variable ( cualquiera), : (dos puntos),
        nombre de la matriz
        */
        for(String i:paises){
            
            System.out.println("Pais " + i);
        }
    }
    
}
