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
public class Manipula_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      String nombre="adriansito";
      
        System.out.println("Mi nombre es: " + nombre );
        System.out.println("MI nombre tiene: " + nombre.length() + " letras");//tamaño del string, osea en cuantos valores consiste su string
        System.out.println("Mi primera letra de mi nombre es: " + nombre.charAt(0));//impimir posicion de un caracter
        
        int ultimaLetra;
        
        ultimaLetra= nombre.length();
        
        System.out.println("Mi ultima letra de mi nombre es :" + nombre.charAt(ultimaLetra-1));//imprimir ultima letra, se resta -1, porque charArt empieza desde 0, y length desde 1
      
      
           
    }
    
}
