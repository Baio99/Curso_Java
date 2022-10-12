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
public class Uso_EmpleadoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar con Strings
        /*para crear un arreglo Llamo mi clase creada EmpeladoC[], nombre del array en este caso (Mi_empleado)
        ,=, new, Nombre de la clase creada osea EmpleadoC, de cuanto el array []*/
        EmpleadoC[] Mi_empleado = new EmpleadoC[3];
        /*ingreso mis datos en el objeto, con los parametros que construi en el constructor*/
        Mi_empleado[0] = new EmpleadoC("Adrian", 1500, 1999, 12, 07);
        Mi_empleado[1] = new EmpleadoC("Dora", 2000, 1999, 03, 18);
        Mi_empleado[2] = new EmpleadoC("jhordy", 1200, 1999, 11, 22);
        /*creo un for, para aplicar el metodo de subir sueldo a todos mis objetos llamado (Mi_empleado)*/
        for (int i = 0; i < 3; i++) {

            Mi_empleado[i].subirSueldo(5);
        }
        /*creo un for para imprimir, el nomb re de mi objeto. el metodo getter*/
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre : " + Mi_empleado[i].dime_nombre() + " Sueldo : " + Mi_empleado[i].dime_sueldo()
                    + " Fecha Contrato : " + Mi_empleado[i].dime_altaContraro());

        }

    }

}

class EmpleadoC {

    //creo el constructor con los tipos de datos de las variables que usare
    //el constructor debe tener el mismo nombre que la clase
    public EmpleadoC(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;
        sueldo = sue;
        /*creo un objeto, llamo a la clase gregorian calendar y creo un objeto llamado calendario, y en los parametros
       usare el constructor de gregorian calendar que me pide, 3 datos de tipo entero, entonces ahi usare las variables
        de mi constructor empleado, las que son int mes, int dia, int agno, etonces
        llamo a la clase gregorian calendar, creo un objeto llamado calendario = new, llamo a la clase de nuevo gregorian
        calendar, y los parametros ( agno, mes, dia)*/
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        /*uso el metodo. getTime, este me devuelve un dato de tipo Date, por eso le igual a la variable: altaContrato
        porque de igual manera esta variable es de tipo Date*/
        altaContrato = calendario.getTime();

    }

    //creo los getter
    //syntaxys: public, tipo de dato, nombre del metodo () {return ;}
    public String dime_nombre() {
        return nombre;
    }

    public double dime_sueldo() {
        return sueldo;
    }

    public Date dime_altaContraro() {
        return altaContrato;
    }

    // setter
    //syntaxys, public void, nombre del metodo (){}
    public void subirSueldo(double porcentaje) {

        Double aumento = sueldo * porcentaje / 100;

        sueldo = sueldo + aumento;

    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

}
