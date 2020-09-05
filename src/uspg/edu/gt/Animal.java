/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;

/**
 *
 * @author marit
 */

//NO SE PUEDE CUANDO TIENE EL abstract
//Animal animal = new Animal();
public abstract class Animal {
    //Clase Padre
    
    private String nombre;
    private String tipo_alimentacion;
    private int edad;

    public Animal(String nombre, String tipo_alimentacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
   
    
    public Animal (String nombre){
        this.nombre = nombre;
    }
    
    public Animal(){
       //Sin Parametros 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodo Abstracto
    public abstract void Alimentarse();
    
    public abstract void correr();
    
    public void dormir(){
        System.out.println("Esta durmiendo: Zzzz");
    }
    
}
