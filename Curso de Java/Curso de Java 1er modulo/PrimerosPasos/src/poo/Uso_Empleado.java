/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Adrian
 */
public class Uso_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar
        //llamo a la clase creada, en este caso es empleado, y creo un objeto, con los parametros que se creo el constructor
        
        Empleado empleado1= new Empleado("Adrian",1500, 1999, 12, 07);
        Empleado empleado2 = new Empleado("Dora", 2500, 1999, 10, 05);
        Empleado empleado3= new Empleado("Camila", 2000, 1999, 11, 03);
        
        //llamo a los metodos
        
        empleado1.subirSueldo(5);
        empleado2.subirSueldo(6);
        empleado3.subirSueldo(7);
        
        //imprimo los obejetos
        System.out.println("Nombre: " +  empleado1.dime_nombre() + "  Sueldo: " + empleado1.dime_sueldo() + " fecha: " +  empleado1.dime_altaContraro());
        System.out.println("Nombre: " +  empleado2.dime_nombre() + "  Sueldo: " + empleado2.dime_sueldo() + " fecha: " +  empleado2.dime_altaContraro());
        System.out.println("Nombre: " +  empleado3.dime_nombre() + "  Sueldo: " + empleado3.dime_sueldo() + " fecha: " +  empleado3.dime_altaContraro());
    }
    
}

class Empleado{
    //creo el constructor con los tipos de datos de las variables que usare
    //el constructor debe tener el mismo nombre que la clase
    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        
        nombre=nom;
        sueldo=sue;
        /*creo un objeto, llamo a la clase gregorian calendar y creo un objeto llamado calendario, y en los parametros
       usare el constructor de gregorian calendar que me pide, 3 datos de tipo entero, entonces ahi usare las variables
        de mi constructor empleado, las que son int mes, int dia, int agno, etonces
        llamo a la clase gregorian calendar, creo un objeto llamado calendario = new, llamo a la clase de nuevo gregorian
        calendar, y los parametros ( agno, mes, dia)*/
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        /*uso el metodo. getTime, este me devuelve un dato de tipo Date, por eso le igual a la variable: altaContrato
        porque de igual manera esta variable es de tipo Date*/
        altaContrato=calendario.getTime();
        
        
        
    }  
    
    //creo los getter
    //syntaxys: public, tipo de dato, nombre del metodo () {return ;}
    public String dime_nombre(){
        return nombre;
    }
    public double dime_sueldo(){
        return sueldo;
    }
    
    public Date dime_altaContraro(){
        return altaContrato;
    }
    // setter
    //syntaxys, public void, nombre del metodo (){}
    public void subirSueldo(double porcentaje){
        
        Double aumento=sueldo *porcentaje/100;
        
        sueldo=sueldo + aumento;
        
        
    }
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
        
}
