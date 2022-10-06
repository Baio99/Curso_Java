/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.lang.Object;

/**
 *
 * @author Adrian
 */
public class Carro {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
  
    
    // metodo constructor
    //el metodo constructor siempre va con el nombre de la clase y con parentesis
    // ES UN METODO ESPECIAL, QUE SE ENCAGRA EN DAR UN ESTADO INICIAL AL OBJETO
    // DEBE LLAMARSE IGUAL QUE LA CLASE
    
    public Carro(){
        
        ruedas=4;
        largo=2000;
        ancho=300;
        motor= 1600;
        peso_plataforma=500;
        
    }
    //metodos, metodo getter, me proporcionar el valor de la propiedad osea me muestran
    /*syntaxys, public, tipo de dato a devolver , nombre del metodo() (cualquier nombre)*{codigo + return}*/
    
    public String dime_datos_generalez(){
        return   "la plaraforma del vehiculo tiene "+ ruedas + " ruedas " + " y mide "+ largo + 
                " largo " + ancho + " ancho "+ " y un peso de plataforma de " + peso_plataforma;
        
        
    }
    /*setter, lo que va entre parentesis son los parametros ahi va el tipo de dato que voy a usar
    seguido del nombre de una variable */
    public void establecer_color(String color_coche){
      // variable declarada para el color = a la variable que hiso en el parametro  
        color=color_coche;
        
    }
    //getter
    public String dime_color(){
    return "el color del coche es  " + color;
    } 
    
    /*setter, siempre va con void porque no devuelve nada, nonbre del metodo, (tipo de dato del parametro
    , nombre de la variable del parametro)*/
    public void configurar_asientos(String asientos_cuero){
        /*this. hace referencia a la variable de la clase, no a la del parametro del setter
        si los asientos de cuero es igual a la palabra si*/
        this.asientos_cuero = asientos_cuero.equalsIgnoreCase("si"); /* this. asientos hace referencia a la variable de la clase, como es de tipo boolean, acepta
        solo true y false */ // this.asientos_cuero= true
        // si no, this.asientos_cuero= false
        
    }
    /*getter, tipo de dato a devolver, nombre del metodo, y al final necesita un return*/
    public String dime_asientos(){
    /*this.asientos_cuero hace referencia a la variable de la clase
        si, this.asientos_cuero es igual a true*/   
        if (this.asientos_cuero==true) {
      // me retorna el mensaje: el carro tiene asientos de cuero;      
           return "El carro tiene asientos de cuero ";
         // si no, me retorna el carro no tiene asientos de cuero   
        }else{
            return "El carro no tienen asientos de cuero, son estandar";
        }
    }
    /*setter: void, nombre del metodo, parametros*/
    public void configurar_climatizador(String climatizador){
        
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador=true;
            
        }else{
            this.climatizador=false;
        }
        
    }
    //getter
    public String dime_climatizador(){
    
            if (this.climatizador==true) {
                
                return "Tiene climatizador";
                
            }else{
                return "no tiene climatizador";
            }
}
    //setter y getter a la misma vez del peso
    public String establecer_peso(){
        
        int peso_carroceria=500;
        peso_total=peso_plataforma+peso_carroceria;
        
        
        if (asientos_cuero==true) {
            
            peso_total=peso_total+50;  
                     
        }  
        if (climatizador==true) {
            
            peso_total=peso_total+20;

        }
        return "El peso es: " +peso_total;
        
        
    }
    
    /*setter y getter a la misma vez del precio*/
    
    public int establecer_precio(){
        
       int precio_final =10000;
       
        if (asientos_cuero==true) {
            
            precio_final=precio_final+2000; 
            
        }
        if (climatizador==true) {
            
            precio_final=precio_final+1500;
            
        }
        return precio_final;
        
        
    }
    
    
    
    
    
    
    
    
}
