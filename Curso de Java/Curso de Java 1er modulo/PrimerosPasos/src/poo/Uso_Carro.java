/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import javax.swing.*;

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
        , nombre del obejto ( el que o desse), =, new, nombre de la clase creada donde esta el constructor (osea carro) */
        
        Carro renault= new Carro(); //instanciar una clase, ejemplar de clase
        
        // podemos sobreescribir nuevos datos asi
        
        /*renault.ancho=1400;
        renault.largo=500;
        renault.motor=300;
        renault.peso=1500;
        renault.ruedas=4;*/
        
        // o imprimir los datos guardados de la clase carro
        /*System.out.println(" este coche tiene " + renault.ancho + " ancho ");
        System.out.println(renault.largo + " largo");
        System.out.println(renault.motor + " su motor");
        System.out.println(renault.peso + " de peso ");
        System.out.println(renault.ruedas + " ruedas");
        
        
    }*/
        //aplicando metodos, getter
        renault.establecer_color(JOptionPane.showInputDialog("Introduce el color "));// me establece el color del metodo, si no pongo estee me saldria null
        System.out.println(renault.dime_datos_generalez());
        System.out.println(renault.dime_color());
        /*primero llamo al setter para asignar el valor
        entonces. nombre del objeto.nombre del metodo
        renault.configurar_asientos=si o no, igualmente uso JOPTION PANE, para que mi respuesta
        reciba un cuadro de dialogo grafico ( es opcional)*/
        renault.configurar_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        // me imprime el getter, con la condicion que tiene
        System.out.println(renault.dime_asientos());
          /*primero llamo al setter para asignar el valor
        entonces. nombre del objeto.nombre del metodo
        renault.configurar_climatizador=si o no, igualmente uso JOPTION PANE, para que mi respuesta
        reciba un cuadro de dialogo grafico ( es opcional) */
        renault.configurar_climatizador(JOptionPane.showInputDialog("¿Tiene Climatizador?"));
        //lamo al setter
        System.out.println(renault.dime_climatizador());
        
        //aqui uso los que son getter y setter a la misma vez, por eso no hace falta primero llamar al setter
        System.out.println(renault.establecer_peso());
        System.out.println("El precio total es " + renault.establecer_precio());
    
}
}
