/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class Do_while_ejercicio1 {

    //programa que calcula el peso ideal, preguntando si es hombre o mujer y su altura en cm
    //en tal caso no ingrese la letra h o m seguira saliendo la vetana de ingresar su genero
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String genero = "";
        //el do while, primero hace y luego comprueba, osea almenos reliza una vez el codigo
        do {/* hacer, 
          
            que pida que ingrese su genero mediante una ventana*/
            genero = JOptionPane.showInputDialog("Ingrese su genero (H/M)");
        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);/*mientras genero sea igual 
        a la letra H o M sin importar si es mayuscula o minuscula*/
        String altura = JOptionPane.showInputDialog("Ingrese su altura en cm");/* string porque el metodo show
        de la clase JOPTION me devuelve un string, por lo cual toca convertir de un tipo de dato a otro*/
        int altura_n = Integer.parseInt(altura);//convertir el string a entero
        int pesoIdeal1;//declarar variables
        int pesoIdeal2;
        if (genero.equalsIgnoreCase("H")) {
            pesoIdeal1 = altura_n - 110;
            System.out.println("tu peso ideal es: " + pesoIdeal1 + "kg");
        } else if (genero.equalsIgnoreCase("M")) {
            pesoIdeal2 = altura_n - 120;
            System.out.println("tu peso ideal es: " + pesoIdeal2 + "kg");

        }

    }

}
