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
public class Conejo extends Animal {
    private String color;

    public Conejo(String color, String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.color = color;
    }

    public Conejo(String color, String nombre) {
        super(nombre);
        this.color = color;
    }

    public Conejo(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void mostrar (){
        System.out.println(getNombre()+" - "+getTipo_alimentacion()+" - "+getEdad()+" - "+getColor());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de pasto y lechuga");
        }

    @Override
    public void correr() {
        System.out.println("Corro con mis cuatro patas, pero la fuerza esta"
                + "en las dos patas de atras");
    }
    
    
    
}

