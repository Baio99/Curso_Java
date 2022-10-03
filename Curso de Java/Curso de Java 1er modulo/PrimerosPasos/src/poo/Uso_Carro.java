/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Adrian
 */
public class Uso_Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*nombre de la clase creada donde esta el constructor (osea carro)
        , nombre de una variable cualquiera, =, new, nombre de la clase creada donde esta el constructor (osea carro) */
        
        Carro renault= new Carro(); //instanciar una clase, ejemplar de clase
        
        // podemos sobreescribir nuevos datos asi
        
        /*renault.ancho=1400;
        renault.largo=500;
        renault.motor=300;
        renault.peso=1500;
        renault.ruedas=4;*/
        
        // o imprimir los datos guardados de la clase carro
        System.out.println(" este coche tiene " + renault.ancho + " ancho ");
        System.out.println(renault.largo + " largo");
        System.out.println(renault.motor + " su motor");
        System.out.println(renault.peso + " de peso ");
        System.out.println(renault.ruedas + " ruedas");
        
        
    }
    
}
