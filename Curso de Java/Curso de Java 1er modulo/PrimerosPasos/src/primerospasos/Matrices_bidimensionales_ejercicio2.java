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
public class Matrices_bidimensionales_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*declarar e inicializar la matriz, como es de dos dimensiones su syntaxys es asi:
        tipo de dato, dos corchetes [][], nombre cualquier para la matriz, 
        = abro llaves con un punto y coma al final para ingresar aqui las dos dimensiones
        de la matriz {};
        para las dimensiones igualmente abro llaves pero sin el punto y coma, solo una coma al final , 
        entonces queda asi, { {}, {} };
        o asi
        { {}, 
          {},
          {}  };
        */
        int[][] matriz = {
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {90, 100, 200, 300},
            {400, 500, 600, 700}};
/* for each con matrices, tipo de dato de la matriz, abro corchetes [], nombre de 
        una variable cualquiera, dos puntos : , nombre de la matriz*/
        for (int[] mat : matriz) {

            System.out.println();

            for (int i : mat) {

                System.out.print(i + " ");

            }

        }

    }

}
