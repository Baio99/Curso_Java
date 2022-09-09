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
public class Manipula_Cadena2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          String cadena="Actualmente no me siento muy bien";
          String subcadena= cadena.substring(12, 33) + " necesito unas vacaciones " + cadena.substring(0, 11) ;// posisicion, desde que posicion hasta que posicion deseo la subcadena
          
          System.out.println(subcadena);
          
          
          System.out.println("___________________________________________");
          System.out.println("Comparacion de cadenas");
          
          String nombre1, nombre2,nombre3,nombre4;
          
          nombre1="Adrian";
          nombre2="Adrian";
          nombre3="Camila";
          nombre4="camila";
          
          System.out.println("COMPARANDO CON EQUALS");
          System.out.println(nombre1.equals(nombre2));
          System.out.println(nombre3.equals(nombre4));
          
          System.out.println("COMPARANDO CON EQUALS IGNORE");
          System.out.println(nombre3.equalsIgnoreCase(nombre4));
          
          
          
          
        // TODO code application logic here
    }
    
}
