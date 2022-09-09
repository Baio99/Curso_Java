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
public class Constantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int c = 10; // ESTO ES UNA DECLARACION DE CONSTANTE, OSEA NO SE PUEDE CAMBIAR, SI NO DARIA ERROR

        final double aPulgadas = 2.74;

        double cm = 6;

        double respuesta = cm / aPulgadas;

        System.out.println("El resultado de " + cm + " en pulgadas es " + respuesta);

        System.out.println("Extra");
        int a = c / 2;

        System.out.println(a);
        
    }

}
