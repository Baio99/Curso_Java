/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class Condicional_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Eliga una opcion numerica: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
        
        int opcion = entrada.nextInt();// se declara una variable entera para usar en el switch
        
        switch(opcion){// traducido, en los parentesis va el nombre de la variable que he declarado
            
            case 1:// mira si es caso 1
                
                String lado = JOptionPane.showInputDialog("Introduce el lado");//Jopton usa metodos estaticos por lo cual se usa la classe . seguido del metedo, esa una ventana para ingresar datos
                
                int lado_n=Integer.parseInt(lado);
                
                System.out.println("El area del cuadrado es: " + (lado_n*lado_n));
                
                break;// foraza el cierre, me saca del switch
                
            case 2:// mira si es caso 2
                
                String base = JOptionPane.showInputDialog("Introduce la base ");
                 String altura = JOptionPane.showInputDialog("Introduce la altura ");
                 
                 int base_n=Integer.parseInt(base);
                 int altura_n=Integer.parseInt(altura);
                 
                 System.out.println("El area del rectangulo es: " + (base_n*altura_n));
                         
                break;
                
            case 3: // mira si es caso 3
                
                String base2 = JOptionPane.showInputDialog("Introduce la base ");
                 String altura2 = JOptionPane.showInputDialog("Introduce la altura ");
                 
                 int base2_n=Integer.parseInt(base2);
                 int altura2_n=Integer.parseInt(altura2);
                 
                 int area_total=(base2_n*altura2_n)/2;
                
                System.out.println("El area del rectangulo es: " + area_total);
                       
                break;
                
                case 4: // mira si es caso 4
                    
                    String radio= JOptionPane.showInputDialog("Introduce el radio del circulo");
                     
                    double radio_d=Double.parseDouble(radio);
                    
                    double area= Math.PI*Math.pow(radio_d,2);// debe ser double porque es un valor con decimales
                    
                    System.out.println("El area del circulo es: " + area);
                    
                    break;
                    
                default:// si no escoje ninguna de las opciones anteriores
                    System.out.println("La opcion no es correcta");
                    
             
        }
        
        
    }
    
}
