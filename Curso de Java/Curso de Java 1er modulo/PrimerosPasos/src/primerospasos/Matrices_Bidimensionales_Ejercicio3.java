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
public class Matrices_Bidimensionales_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    /*hacer la tabla 6*5 con una base de 10000 en la primera dimension
    y en la segunda dimension la suma de cada % dado 
    10%     11%     12%       13%     14%     15%
    10000   10000   10000   10000   10000    10000  //base
    base+ interes  base+ interes base+ interes base+ interes
        
     */
    public static void main(String[] args) {
        //declaro la variable acumulado de tipo doble, y delcaro e inicializo la variable interes
        double acumulado;
        double interes = 0.10;
// creo una matriz de dos dimensiones llamada  "matriz" de tipo doble de 6*5
        double[][] matriz = new double[6][5];
//creo un for para recorrer la primera dimension, osea el valor de la base
//tomar en cuenta que las posiciones se recorren desde 0
        for (int i = 0; i < 6; i++) {
//en la posicion [0][0] ubico el valor de la base = 10000
//inicializco la variable acumulado
            matriz[i][0] = 10000;
            acumulado = 10000;
//creo un for para recorrer la segunda dimension, osea la sumatoria del interes
            for (int j = 1; j < 5; j++) {
// acumulado es la sumatoria de cada interes
                acumulado = acumulado + (acumulado * interes);
// ubico la sumatoria en la matriz i,j                
                matriz[i][j] = acumulado;
            }
// este es el cierre del for de la primera dimension
//entonces como en la primera dimension el interes va sumando a 11,12,13...
//entonces le sumo en un 0.1 al interes
            interes = interes + 0.1;
        }
//para imprimir los resultados

//creo un fora para imprimir los datos de la primera dimension, osea las bases de todos
        for (int z = 0; z < 6; z++) {

            System.out.println();
            System.out.println();
            // un for apra imprimir la segunda dimension osea la sumatoria del interes          
            for (int h = 0; h < 5; h++) {

                //System.out.printf("%1.2f", matriz [z][h]);
                System.out.println(matriz[z][h]);

            }

        }

    }

}
