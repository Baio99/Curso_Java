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
public class For_each_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    //imprimir numeros aleatorios, que se guardaron en una matriz con for each
    public static void main(String[] args) {
        
        //declaro e inicializo una matriz de tipo int de 150
        
        int [] numeros_aleatorios=new int [150];
        
        //hago un for
        //inicio desde la posicion 0, hasta menor de 150, en pasos de 1
        
        for (int i = 0; i <numeros_aleatorios.length; i++) {
           
          /*numeros aleatorios en la posicion que inicia osea 0
            es igual a (hago una refundicionm ya que quiero numeros enteros) math random
            me da numeros aleatorios, *100 para que sean numeros mas grandes osea del 1 al 100
            */
          numeros_aleatorios[i]=(int)Math.round(Math.random()*100);        
        }
        //for each, tipo de dato de la matriz, una variable cualquuiera, dos pu ntos :, nombre de la matriz
        for(int numero_a:numeros_aleatorios){
            
            System.out.print(numero_a + " ");
        
        }
    }
    
}
