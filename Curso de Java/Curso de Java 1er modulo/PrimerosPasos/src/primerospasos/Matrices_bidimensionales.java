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
public class Matrices_bidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declaro e inicializo una matriz de dos dimensiones
        syntaxys
        tipo de dato, (dos corchetes porque son dos dimensiones) [][],
        nombre de la matriz, (la palabra) new, tipo de dato, (abro dos corchetes) [][]
        el primer corchete es para la primera dimension (se podria decir las columnas)
        y como se inicia dede 0 las posiciones seria, 0,1,2 y ahi seria 3 espacios
                                                            ->
                                                            ->
                                                            ->
        el segundo corchete es para la segunda dimension (se podria decir que son las filas)
        igualmente las posiciones inician desde 0, seria 0,1,2,3 y abi seria 4 espacios
        
                                                            |
                                                            v  
        
                                                            |
                                                            v
        */
        int [][] matriz= new int [3][4];
        
        /* 
               [1ra Dimension] [2da dimension]
        */
        
        matriz [0][0]=1;
        matriz [0][1]=2;
        matriz [0][2]=3;
        matriz [0][3]=4;
      
        
        matriz [1][0]=5;
        matriz [1][1]=6;
        matriz [1][2]=7;
        matriz [1][3]=8;
      
        
                
        matriz [2][0]=9;
        matriz [2][1]=10;
        matriz [2][2]=11;
        matriz [2][3]=12;  
       /* el primero for con [i] recorre la primera dimenson*/  
        for (int i = 0; i < 3; i++) {
            /* el segundo for con [j] recorre la segunda dimenson*/  
            for (int j = 0; j < 4; j++) {
                
                System.out.println(" resultado de la posicion " + "["+ i +"]" +"["+ j  +"]"+ " " + matriz[i][j]);
                
            }
            
        }
        
        
        
        
    }
    
}
